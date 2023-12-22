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
public class AC implements Device {
    private boolean on = false;
    private int temperature = 25; // Default temperature
    
    // ... other AC-specific methods and properties

    @Override

    
public boolean isEnabled()
 
{
        return on;
    }

    @Override

    
public void enable()
{
    on = true;
}

@Override

public void disable()
{
    on = false;
}

    @Override

    
public int getVolume()
 
{
    return temperature; // Map temperature to volume for remote compatibility
}

@Override
public void setVolume(int temperature) 
{
    this.temperature = temperature;
}

@Override
public int getChannel() 
{
return 0; // AC doesn't have channels
}

@Override
public void setChannel(int channel) {
     

       // No action needed for AC
    }

@Override
 public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm AC.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current temperature is " + temperature + "°C");
        System.out.println("------------------------------------\n");
    
 }
   
}