/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import ArxmlLib.*;
import AutoSarTools.AutoSarInterface;
import DrsSim.DrsGen;
import javax.xml.bind.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ssjz99
 */
enum CMD_RT_STATUS {
    IDLE, RUN
}

public class Cmd implements Runnable {

    private CMD_RT_STATUS status = CMD_RT_STATUS.IDLE;
    private final List<File> files = new ArrayList();
    private final PipedOutputStream pos = new PipedOutputStream();
    private final BufferedOutputStream bos = new BufferedOutputStream(pos);
    private final PrintStream ps = new PrintStream(bos);

    public Cmd() {
    }

    public PipedOutputStream getPos() {
        return pos;
    }

    public void processArxml(File autosar_file, File base_type_file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AUTOSAR.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            AUTOSAR autosar = (AUTOSAR) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(autosar_file));
            if (base_type_file != null) {
                JAXBContext bst_jaxbContext = JAXBContext.newInstance(AUTOSAR.class);
                Unmarshaller bst_jaxbUnmarshaller = bst_jaxbContext.createUnmarshaller();
                AUTOSAR bst = (AUTOSAR) JAXBIntrospector.getValue(bst_jaxbUnmarshaller.unmarshal(base_type_file));
                for (ARPACKAGE pkg : bst.getARPACKAGES().getARPACKAGE()) {
                    autosar.getARPACKAGES().getARPACKAGE().add(pkg);
                }
            }
            //processAutosar(autosar);
            AutoSarInterface aif = new AutoSarInterface(autosar, ps);
            RteSim.RteGen gen = new RteSim.RteGen(aif, ps);
            for (APPLICATIONSWCOMPONENTTYPE swc : aif.getSwcs()) {
                String sim = gen.generateSim(swc);
                String inc = gen.generateSimIncludes(swc);
                String typdef = gen.generateSimTypes();
                FileWriter sim_file = new FileWriter(String.format("Rte_%s.c", swc.getSHORTNAME().getValue()));
                FileWriter inc_file = new FileWriter(String.format("Rte_%s.h", swc.getSHORTNAME().getValue()));
                FileWriter typdef_file = new FileWriter("Rte_Type.h");
                sim_file.write(sim);
                inc_file.write(inc);
                typdef_file.write(typdef);
                sim_file.close();
                inc_file.close();
                typdef_file.close();

                /*drs*/
                DrsGen drs = new DrsGen(aif,ps);
                drs.generate(swc);
            }
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

    public void processArxml(List<File> in_files) {
        if (this.status == CMD_RT_STATUS.IDLE) {
            this.files.addAll(in_files);
            this.status = CMD_RT_STATUS.RUN;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
                switch (this.status) {
                    case IDLE: {
                        break;
                    }
                    case RUN:
                        process();
                        this.status = CMD_RT_STATUS.IDLE;
                        break;
                    default: {
                        break;
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private void process() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AUTOSAR.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            AUTOSAR autosar = (AUTOSAR) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(files.get(0)));
            for (int i = 1; i < files.size(); i++) {
                if (files.get(i) != null) {
                    //JAXBContext bst_jaxbContext = JAXBContext.newInstance(AUTOSAR.class);
                    //Unmarshaller bst_jaxbUnmarshaller = bst_jaxbContext.createUnmarshaller();
                    AUTOSAR bst = (AUTOSAR) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(files.get(i)));
                    for (ARPACKAGE pkg : bst.getARPACKAGES().getARPACKAGE()) {
                        autosar.getARPACKAGES().getARPACKAGE().add(pkg);
                    }
                }
            }
            //processAutosar(autosar);
            AutoSarInterface aif = new AutoSarInterface(autosar, ps);
            RteSim.RteGen gen = new RteSim.RteGen(aif, ps);
            for (APPLICATIONSWCOMPONENTTYPE swc : aif.getSwcs()) {
                String sim = gen.generateSim(swc);
                String inc = gen.generateSimIncludes(swc);
                String typdef = gen.generateSimTypes();
                FileWriter sim_file = new FileWriter(String.format("Rte_%s.c", swc.getSHORTNAME().getValue()));
                FileWriter inc_file = new FileWriter(String.format("Rte_%s.h", swc.getSHORTNAME().getValue()));
                FileWriter typdef_file = new FileWriter("Rte_Type.h");
                sim_file.write(sim);
                inc_file.write(inc);
                typdef_file.write(typdef);
                sim_file.close();
                inc_file.close();
                typdef_file.close();

                /*drs*/
                DrsGen drs = new DrsGen(aif,ps);
                drs.generate(swc);
            }
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
