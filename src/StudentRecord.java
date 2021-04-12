public class StudentRecord {
    private String degree;
    private String years;
    public StudentRecord(String d , String y){
        this.degree=d;
        this.years=y;
    }
    public void setDegree(String d){
        this.degree=d;
    }
    public String getDegree(){
        return degree;
    }
    public void setYears(String y){
        this.years=y;
    }
    public String getYears(){
        return years;
    }
}
