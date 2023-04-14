/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author luthfisiregar5
 */
public class Profile extends Family{
    public enum genderType {
        male,
        female
    }
    
    public int employeeId;
    public String firstName;
    public String lastName;
    public int idNumber;
    public String address;    
    public genderType gender; //true = Laki-laki, false = Perempuan
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public genderType getGender() {
        return gender;
    }

    public void setGender(genderType gender) {
        this.gender = gender;
    }
    
}
