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
public class MediaSize implements Serializable {

    private List<MediaSizeOption> option;

    public List<MediaSizeOption> getOption() {
        return option;
    }

    public void setOption(List<MediaSizeOption> option) {
        this.option = option;
    }
}
