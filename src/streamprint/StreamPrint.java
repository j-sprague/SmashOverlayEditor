/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author jsman
 */
public class StreamPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmashOverlay myStartFrame =new SmashOverlay();
        myStartFrame.setTitle("SmashOverlayEditor by Skeet");
        ImageIcon img = new ImageIcon("stockicons/icon.png");
        myStartFrame.setIconImage(img.getImage());
        myStartFrame.setVisible(true);
        myStartFrame.retrieveSave();
    }
    
}
