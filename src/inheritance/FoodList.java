/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 */
public class FoodList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tuna tunaObj = new Tuna();
        Wings wingsObj = new Wings();
        FruitsSalad fruitsObj = new FruitsSalad();
//        Scanner sc = new Scanner (System.in);
//        int input = sc.nextInt();
        
        System.out.println("\nHow much you like the food, please give Rating otta 10 : "+ tunaObj.getTasteLevel());
        tunaObj.eat();
        wingsObj.eat();
        System.out.println(fruitsObj.berries());
        fruitsObj.eat();
        
        
        //System.out.println("Tuna method from inherited from Foods--> "+ tunaObj.eat());
        
    }

    
}
