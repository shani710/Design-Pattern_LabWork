/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask;

import TutorialPointExample.*;

/**
 *
 * @author fa20-bse-053
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyound the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("Vlc", "far far away.vlc");
        audioPlayer.play("Mx", "mind me.mx");
        audioPlayer.play("Div", "mind me.div");


    }
    
}
