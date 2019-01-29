/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RteSim;

import AutoSarTools.*;
import AutosarClass.*;

/**
 *
 * @author ssjz99
 */
public class RteGenCallArgument extends RteGenCommon{
    private final AutoSarInterface aif;
    private final ARGUMENTDATAPROTOTYPE arg;
    private final String arg_name;
    private final String arg_type_name;
    private final boolean in;

    public RteGenCallArgument(AutoSarInterface i, ARGUMENTDATAPROTOTYPE type) {
        aif = i;
        arg = type;
        IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(arg);
        arg_name = arg.getSHORTNAME().getValue();
        arg_type_name = im_type.getSHORTNAME().getValue();
        in = (arg.getDIRECTION().getValue() == ARGUMENTDIRECTIONENUMSIMPLE.IN);
    }

    public String getArgName() {
        return arg_name;
    }

    public String getArgTypeName() {
        return arg_type_name;
    }

    public boolean isIn() {
        return in;
    }
    
}
