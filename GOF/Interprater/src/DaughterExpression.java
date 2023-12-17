/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fa20-bse-053
 */
public class DaughterExpression implements Expression {
    private Expression parentExpr;
    private Expression childExpr;

    public DaughterExpression(Expression parentExpr, Expression childExpr) {
        this.parentExpr = parentExpr;
        this.childExpr = childExpr;
    }

    @Override
    public boolean interpret(String context) {
        String[] parts = context.split(" is a daughter of ");
        if (parts.length == 2) {
            String parent = parts[1]; // Daughter is second
            String child = parts[0]; // Parent is first

            return parentExpr.interpret(parent) && childExpr.interpret(child);
        }
        return false;
    }
}