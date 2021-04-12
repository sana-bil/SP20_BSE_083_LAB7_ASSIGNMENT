public class EployeeRunner {
    public static void main(String[] args) {
        Date dob = new Date(2002,18,5);
        Date doh = new Date(2019,12,8);
        Employee employee= new Employee("ansar", "afzal",dob,doh);
        employee.display();
    }
}
