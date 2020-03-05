/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * We use @extends for inheritance 
 * only inherits public methods and fields
 * if you use same method in a child and parent class, it overrides the super class method with the subclass ones
 *
 * @author Muhammad
 */
public class Food {
    private int tasteLevel=9;
    
    
    public void eat(){
        System.out.println("I am the eat method");
    
    }

    /**
     * @return the tasteLevel
     */
    public int getTasteLevel() {
        return tasteLevel;
    }

    /**
     * @param tasteLevel the tasteLevel to set
     */
    public void setTasteLevel(int tasteLevel) {
        
        this.tasteLevel = tasteLevel;
    }
    
}
