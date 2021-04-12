public class Employee {
    private String name;
    private String FatherName;
    private Date dob;
    private Date doh;
    public Employee(String name, String fatherName,Date dob , Date doh){
        this.name=name;
        this.FatherName=fatherName;
        this.dob=dob;
        this.doh=doh;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setFatherName(String fatherName){
        this.FatherName=fatherName;
    }
    public String getFatherName(){
        return FatherName;
    }
    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Father name: "+ FatherName);
        System.out.println("Date of birth : "); dob.display();
        System.out.println("Date of hire : "); doh.display();
    }
}

