/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Example;

/**
 *
 * @author FA20-BSE-062
 */
public class Linkedln  extends Network{


    public Linkedln(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
       
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        super.simulateNetworkLatency();
        System.out.println("\n\nLogIn success on linkedln");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
    
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on linkedln");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logOut() {
        System.out.println("User: '" + userName + "' was logged out from linkedln");
    }
    
}