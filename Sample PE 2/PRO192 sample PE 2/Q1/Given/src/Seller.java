
public class Seller extends Employee {  
    private double revenue;
   
    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    
     /*Complete the below function for second test case*/
    @Override
    public double getSalary() {
        return (revenue < 30000) ? super.getSalary() + 0.05 * revenue : super.getSalary() + 0.1 * revenue;
    }
    
    @Override 
    public String toString() {
        return super.getName() + '\t' + super.getSalary() + '\t' + revenue;
    }
    //add and complete your other methods here (if needed)
    
}
