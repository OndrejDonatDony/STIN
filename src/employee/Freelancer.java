/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author mrdon
 */
public class Freelancer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(String name, double hourlyRate, int hoursWorked) {        
        super(name);
        this.hourlyRate = hourlyRate;
        this.hourlyRate = hourlyRate; 
    }

    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
