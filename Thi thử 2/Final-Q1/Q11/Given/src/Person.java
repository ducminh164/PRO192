/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Person {
    // #: protected
    // ~: default
    private String name;
    private int age;
    
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
       return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Ghi đè - tính kế thừa trong lập trình
    @Override
    public String toString() {
        return age + "\t" + name;
    }

    
}
