/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.google.cloudprint.api.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jittagorn pitakmetagoon
 */
public class SelectCapability implements Serializable {

    private List<SelectCapabilityOption> option;

    public List<SelectCapabilityOption> getOption() {
        return option;
    }

    public void setOption(List<SelectCapabilityOption> option) {
        this.option = option;
    }
}
