/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask;

/**
 *
 * @author Fa20-bse-053
 */
public class UniversalRemote extends BasicRemote {
    
     public UniversalRemote(Device device) {
        super.device = device;
    }

     public void maxVolume() {
        System.out.println("Remote: setting maximum volume");
        device.setVolume(100); // Set volume to maximum (100)
    }
}
    

