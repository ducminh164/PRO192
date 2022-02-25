
public class Worker extends Person{  
    private int salary;
    private String deptName;
    
    public Worker(String name, int salary, String deptName) { 
        super(name);
        this.salary = salary;
        this.deptName = deptName;
    }  
    
    public Worker() {
    }
    
    public int getSalary() {
        return salary;
    }  

    @Override
    public String toString() {
        return super.getName() + "\t" + salary + "\t" + deptName;
    }
    
}
