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
public class CollateTicket implements Serializable {

    private boolean collate;

    public boolean isCollate() {
        return collate;
    }

    public void setCollate(boolean collate) {
        this.collate = collate;
    }
}
