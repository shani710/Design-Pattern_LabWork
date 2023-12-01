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
class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "DOO{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", salary=" + salary +
                '}';
    }
}