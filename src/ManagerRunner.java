public class ManagerRunner {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord("Computer Science", "2020-2024");
        EmployeeRecord e = new EmployeeRecord(45,20000);
        Manager m = new Manager("Senior Manager", 2000,s,e);
        m.display();
    }
}
