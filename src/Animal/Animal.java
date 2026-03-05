/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author mrdon
 */
public abstract class Animal {
    protected String name; //pro potomky protected

    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void makesound();
    
    public String getName(){
        return name;
    }
}
