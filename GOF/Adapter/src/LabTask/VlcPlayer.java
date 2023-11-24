/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask;


/**
 *
 * @author fa20-bse-053
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name"+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //System.out.println("Playing Mp file. Name"+ fileName);

   
    }
     @Override
    public void playMx(String fileName) {
        //System.out.println("Playing Mp file. Name"+ fileName);

   
    }
     @Override
    public void playDiv(String fileName) {
        //System.out.println("Playing Mp file. Name"+ fileName);

   
    }
    
}
