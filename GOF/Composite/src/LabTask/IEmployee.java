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
interface IEmployee {
    void giveBonus(int bonusPercentage);

    public Iterable<IEmployee> getSubordinates();
}