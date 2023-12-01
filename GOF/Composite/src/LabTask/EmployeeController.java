/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-053
 */
class EmployeeController {
    public static void generateOrganogram() {
        Director director = new Director("John", 30000);

        HOD hodSales = new HOD("Robert", 20000, "Sales");
        HOD hodMarketing = new HOD("Michel", 20000, "Marketing");
        Teacher teacher1 = new Teacher("Laura", 10000, "Teaching", "Design Pattern");    
    }
    
    public ststic void activeBonus(String bonusType, int percentageOfBonus){
          List<IEmployee> allEmployees = new ArrayList<>();
          Director director = new Director("John", 30000);
          traverseEmployees(director, allEmployees);
          
          for (IEmployee employee : allEmployees) {
          employee.giveBonus(percentageOfBonus);
          
          }
    }
    private static void traverseEmployees(IEmployee employee, List<IEmployee> allEmployees) {
    allEmployees.add(employee);

    if (employee instanceof Director || employee instanceof HOD) {
        for (IEmployee subordinate : employee.getSubordinates()) {
            traverseEmployees(subordinate, allEmployees);
        }
    }
}
}
