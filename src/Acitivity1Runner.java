public class Acitivity1Runner {
    public static void main(String[] args) {
        Address address = new Address(19,277,"islamabad",3);
        Person person = new Person("Sanabil", "programmer", "islam", address);
        person.display();
    }
}
