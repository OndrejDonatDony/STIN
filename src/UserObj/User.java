/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserObj;

/**
 *
 * @author mrdon
 */
public class User {
    private final String username;
    private String password;
    private boolean validate;

    public User(String username, String password) {
        this.username = username;
        if(password.length() >= 8){
            this.password = password;
            validate = true;
        }else{
            this.password = null;
            validate = false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
       
        if(password.length() >= 8){
            this.password = password;
            validate = true;
        }else{
            this.password = null;
            validate = false;
        }
    }
    public void checkPassword(String input){
        if(validate){
            System.out.println("heslo je spravne zadane");
        }else{
            System.out.println("heslo je SPATNE zadane");
        }
    }
    public void changePassword(String oldPassword, String newPassword){
        if(validate && oldPassword.equals(this.password)){
            this.password = newPassword;
            System.out.println("heslo uspesne zmeneno");
        }else{
            System.out.println("heslo nezmeneno");
        }
    }
    
    
}
