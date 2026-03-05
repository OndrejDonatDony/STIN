/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author mrdon
 */
public class Cat extends Animal {
    
   public Cat(String  name){
        super(name);
    }
    
    @Override //velke O
    public void makesound(){
        System.out.println(name + ": meow");
    }
}
