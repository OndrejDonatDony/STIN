/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer;

/**
 *
 * @author mrdon
 */
public class Processor {
    private final String model; //final protoze vytvorim s nazvem modelu, ktera nechci menit

    public Processor(String model) {
        this.model = model;
    }
    
    public void calculate(){
        System.out.println("Procesor" + model + " pocita");
    }
}
