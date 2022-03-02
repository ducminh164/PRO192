/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class VNMotor extends Motor {
    private String series;
    
    public VNMotor() {
    }
    
    public VNMotor(String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }

    @Override
    public String toString() {
        return super.getBrandName() + "\t" + series + "\t" + super.getPrice();
    }
    
    public double getSalePrice() {
        double discount;
        if (super.getPrice() < 3000) {
            discount = 0.05 * super.getPrice();
        }
        else {
            discount = 0.1 * super.getPrice();
        }
        
        return super.getPrice() - discount;
    }
}
