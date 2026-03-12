/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

import Animal.Animal;
import Animal.Animal;
import Animal.Cat;
import Animal.Cat;
import Animal.Dog;
import Animal.Dog;
import UserObj.User;
import Animal.RobotDog;
import Shipping.AirDelivery;
import Shipping.BikeDelivery;
import Shipping.TruckDelivery;
import computer.Computer;
import employee.Developer;
import employee.Employee;
import employee.Freelancer;
import delivery.Delivery;
import Shipping.AirDelivery;
import Shipping.BikeDelivery;
import Shipping.TruckDelivery;
import delivery.Delivery;

/**
 *
 * @author mrdon
 */
public class STIN_cv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jmeno = "Ondrej";
        String psw = "123456ulala";
        String wpsw = "123";
        String npsw = "123456789";
        
        User u = new User(jmeno,psw);

        u.setPassword(psw);    
        u.checkPassword(psw);
        
        u.changePassword( psw, npsw);
        u.setPassword(wpsw);
        u.checkPassword(wpsw);
        u.changePassword( psw, npsw);
        
        //cv2 animals
        Animal dog = new Dog("zerik");
        dog.makesound();
        
        Animal cat = new Cat("micka");
        cat.makesound();
        
        Animal cat2 = new Cat("mikes");
        cat2.makesound();
        
        RobotDog robotdog = new RobotDog();
        robotdog.makesound();
        
        Computer pc = new Computer("intel 17");
        pc.start();
        
        Employee developer = new Developer("Jan",8000);
        Employee freelancer = new Freelancer("Eva",1000,120);
        
        Delivery d1 = new Delivery("CZ001", 10, new TruckDelivery());
        Delivery d2 = new Delivery("CZ002", 3, new BikeDelivery());
        Delivery d3 = new Delivery("CZ003", 5, new AirDelivery());

        System.out.println(d1.calculatePrice());
        System.out.println(d2.calculatePrice());
        System.out.println(d3.calculatePrice());
   
    }
    
}
