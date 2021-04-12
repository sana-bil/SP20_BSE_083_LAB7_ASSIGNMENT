public class Date {
    private int year;
    private int day;
    private int month;
    public Date(int year, int day , int month){
        this.day=checkDay(day);
        this.month=checkMonth(month);
        this.year=year;
    }
    private int checkMonth(int m){
        if (m>0&&m<=12){
            return m;
        }
        else {
            System.out.println("Invalid month " + m + "set to 1");
            return 1;
        }
    }
    private int checkDay(int d){
        if (d>0&&d<=31){
            return d;
        }
        else if (month==2&&d==29&&(year%400==0||(year%4==0&&year%100!=0))){
            return d;
        }
        else {
            System.out.println("INVALID day  " + d + " "+ "set to 1");
            return 1;
        }
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }

    public void display(){
        System.out.println( month + " " + day + " " + year);
    }
}
