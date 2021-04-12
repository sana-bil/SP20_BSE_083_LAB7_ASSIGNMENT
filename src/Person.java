public class Person {
    private String name;
    private String occupation;
    private String religion;
    private Address address;
    public Person(String name, String occupation, String religion , Address address){
        this.name=name;
        this.occupation=occupation;
        this.religion=religion;
        this.address=address;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
    public String getOccupation(){
        return occupation;
    }
    public void setReligion(String religion){
        this.religion=religion;
    }
    public String getReligion(){
        return religion;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Occupation: " + occupation);
        System.out.println("Religion: "+ religion);
        System.out.println("Address is below: ");
        System.out.print("Street Number: " + address.getStreetNo() + " House Number : " + address.getHouseNo()
        + " City: "+ address.getCity() + " Code: "+ address.getCode());
    }
}
