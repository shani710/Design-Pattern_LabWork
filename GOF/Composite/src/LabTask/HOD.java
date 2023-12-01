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
class HOD extends BaseEmployee {
    private String departmentName;
    private List<IEmployee> subordinates;

    public HOD(String name, int salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee employee) {
        subordinates.add(employee);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        for (IEmployee subordinate : subordinates) {
            subordinate.giveBonus(bonusPercentage);
        }
    }

    @Override
    public String toString() {
        return "HOD{" +
                "name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}