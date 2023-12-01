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
abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;

    public BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        salary += salary * bonusPercentage / 100;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}