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
public class CopiesTicket implements Serializable {

    private int copies;

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
