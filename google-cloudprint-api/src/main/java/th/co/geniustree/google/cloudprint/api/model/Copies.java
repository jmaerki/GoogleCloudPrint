/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.google.cloudprint.api.model;

import java.io.Serializable;

/**
 *
 * @author jittagorn pitakmetagoon
 */
public class Copies implements Serializable {

    private int max;
    private int deflt;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDefault() {
        return deflt;
    }

    public void setDefault(int deflt) {
        this.deflt = deflt;
    }
}
