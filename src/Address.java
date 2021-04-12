public class Address {
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;
    public Address(int streetNo, int houseNo, String city , int code){
        this.streetNo=streetNo;
        this.houseNo=houseNo;
        this.city=city;
        this.code=code;
    }
    public void setStreetNo(int streetNo){
        this.streetNo=streetNo;
    }
    public int getStreetNo(){
        return streetNo;
    }
    public void setHouseNo(int houseNo){
        this.houseNo=houseNo;
    }
    public int getHouseNo(){
        return houseNo;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
