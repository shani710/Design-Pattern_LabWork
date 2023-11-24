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
public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
      else if (audioType.equalsIgnoreCase("mx")){
         advancedMusicPlayer = new MxPlayer();
      }	
       else if (audioType.equalsIgnoreCase("div")){
         advancedMusicPlayer = new DivPlayer();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
      
      else if(audioType.equalsIgnoreCase("mx")){
         advancedMusicPlayer.playMx(fileName);
      }
      else if(audioType.equalsIgnoreCase("div")){
         advancedMusicPlayer.playDiv(fileName);
      }
   }
}