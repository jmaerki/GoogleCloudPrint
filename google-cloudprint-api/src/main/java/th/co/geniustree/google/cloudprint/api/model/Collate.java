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
public class Collate implements Serializable {

    private boolean deflt;

    public boolean isDefault() {
        return deflt;
    }

    public void setDefault(boolean deflt) {
        this.deflt = deflt;
    }
}
