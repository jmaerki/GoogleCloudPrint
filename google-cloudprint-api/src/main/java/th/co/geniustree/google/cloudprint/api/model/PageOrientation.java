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
public class PageOrientation implements Serializable {

    private List<PageOrientationOption> option;

    public List<PageOrientationOption> getOption() {
        return option;
    }

    public void setOption(List<PageOrientationOption> option) {
        this.option = option;
    }
}
