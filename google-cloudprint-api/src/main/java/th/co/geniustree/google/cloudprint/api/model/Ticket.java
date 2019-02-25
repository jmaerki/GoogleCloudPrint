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
public class Ticket implements Serializable {

    private String version = "1.0";
    private PrintTicket print;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PrintTicket getPrint() {
        return print;
    }

    public void setPrint(PrintTicket print) {
        this.print = print;
    }
}
