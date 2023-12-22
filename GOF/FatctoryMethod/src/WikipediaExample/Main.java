/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WikipediaExample;

/**
 *
 * @author Fa20-bse-053
 */
public class Main {
 public static void main(String[] args) {
PersonFactory factory = new PersonFactory();
IPerson person1 = factory.getPerson(PersonType.Rural);
IPerson person2 = factory.getPerson(PersonType.Urban);

System.out.println(person1.getName());  // Output: Village Person
System.out.println(person2.getName());  // Output: City Person
    }   
}