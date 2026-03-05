/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author mrdon
 */
public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double calculateSalary();
    
}
