/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer;

/**
 *
 * @author mrdon
 */
public class Computer {
    private Processor processor;

    public Computer(String cpuModel) {
        this.processor = new Processor(cpuModel);
    }
    
    public void start(){
        System.out.println("Computer: Starting...");
        processor.calculate();
    }
    
    
}
