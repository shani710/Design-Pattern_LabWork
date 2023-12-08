/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GruuExample;

/**
 *
 * @author FA20-BSE-053
 */
import java.awt.*;

/*public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
    
    public void isFruits(){
    
    }
    
}*/
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree; // Added attribute
    private int countOfFruits; // Added attribute

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    TreeType(String name, Color color, String otherTreeData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public
 
void
 
draw(Graphics g, int x, int y)
{
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

    // Getters and setters for new attributes
    public boolean isFruitTree() {
        return isFruitTree;
    }

    public void setFruitTree(boolean fruitTree) {
        isFruitTree = fruitTree;
    }

    public int getCountOfFruits()
    {
        return countOfFruits;
    }

    public void setCountOfFruits(int countOfFruits)
    {
        this.countOfFruits = countOfFruits;
    }
}