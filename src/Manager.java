public class Manager {
    private String title;
    private int dues;
    private StudentRecord s;
    private EmployeeRecord e;

    public Manager(String title, int dues , StudentRecord s , EmployeeRecord e){
        this.title=title;
        this.dues=dues;
        this.s=s;
        this.e=e;
    }
    public void display(){
        System.out.println("Title is "+ title);
        System.out.println("Dues are "+ dues);
        System.out.println("Academic record is below ");
        System.out.println("Degree : "+ s.getDegree() + "\n" + "Graduation years "+ s.getYears());
        System.out.println("Employee record is below ");
        System.out.println("Employee id is "+e.getId()+ "\n " + "Salary is " + e.getSalary() );
    }
}
