



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Teacher {
    private String name;
    private double salary;
    
    public Teacher() {
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name.toLowerCase();
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String s = name + "\t" + salary;
        return s;
    }
    
    
   
}
