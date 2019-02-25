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
public class Color implements Serializable {

    private List<ColorOptopn> option;

    public List<ColorOptopn> getOption() {
        return option;
    }

    public void setOption(List<ColorOptopn> option) {
        this.option = option;
    }
}
