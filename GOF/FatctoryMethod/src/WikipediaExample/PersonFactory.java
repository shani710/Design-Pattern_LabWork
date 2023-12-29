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
public class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new CityPerson();
            default:
                throw new UnsupportedOperationException("Invalid PersonType");
        }
    }
}