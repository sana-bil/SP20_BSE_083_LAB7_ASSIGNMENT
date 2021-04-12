public class EmployeeRecord {
    private int id;
    private double salary;
    public EmployeeRecord(int id, double salary) {
        this.id=id;
        this.salary=salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
