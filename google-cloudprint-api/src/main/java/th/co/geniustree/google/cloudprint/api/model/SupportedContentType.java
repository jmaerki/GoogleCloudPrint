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
public class SupportedContentType implements Serializable {

    private String content_type;

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }
}
