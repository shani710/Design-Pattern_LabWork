/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_task.Singleton;

import lab3_task.*;

/**
 *
 * @author FA20-BSE-053
 */
public class Demo {

	public static void main(String[] args) {
		Connection c = Connection.getInstance();
		c.getData();

	}

}
