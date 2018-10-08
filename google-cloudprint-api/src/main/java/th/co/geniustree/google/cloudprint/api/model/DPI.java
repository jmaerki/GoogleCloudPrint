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
public class DPI implements Serializable {

    private List<DPIOption> option;

    public List<DPIOption> getOption() {
        return option;
    }

    public void setOption(List<DPIOption> option) {
        this.option = option;
    }
}
