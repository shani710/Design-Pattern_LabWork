/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fa20-bse-053
 */
public class SonExpression implements Expression {
    private Expression parentExpr;
    private Expression childExpr;

    public SonExpression(Expression parentExpr, Expression childExpr) {
        this.parentExpr = parentExpr;
        this.childExpr = childExpr;
    }

    @Override
    public boolean interpret(String context) {
        String[] parts = context.split(" is a son of ");
        if (parts.length == 2) {
            String parent = parts[0];
            String child = parts[1];

            return parentExpr.interpret(parent) && childExpr.interpret(child);
        }
        return false;
    }
}