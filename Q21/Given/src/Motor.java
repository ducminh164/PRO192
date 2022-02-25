/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Motor {
    private String brandName;
    private double price;
    
    public Motor() {
    }
    
    public Motor(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brandName + '\t' + price;
    }
    
}
