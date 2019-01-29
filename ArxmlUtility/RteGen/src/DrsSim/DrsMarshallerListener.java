/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrsSim;

/**
 *
 * @author ssjz99
 */
import javax.xml.bind.Marshaller;
import javax.xml.stream.*;
import DrsClass.Global;

public class DrsMarshallerListener extends Marshaller.Listener {

    private XMLStreamWriter xsw;
    private boolean globalFired = false;

    public DrsMarshallerListener(XMLStreamWriter xsw) {
        this.xsw = xsw;
    }

    @Override
    public void beforeMarshal(Object source) {
        try {
            if ((source instanceof Global) && (globalFired == false)) {
                xsw.writeComment("EDRS Version 1.0");
                globalFired = true;
            }
        } catch (XMLStreamException e) {
            // TODO: handle exception
        }
    }

    @Override
    public void afterMarshal(Object source) {
    }

}
