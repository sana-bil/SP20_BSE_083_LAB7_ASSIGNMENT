public class Line {
    private  Point point;
    private double x1;
    private double x;
    private double y1;
    private double y;
    public Line(double x1, double y1,Point point){
        this.x1=x1;
        this.y1=y1;
        this.x= point.x;
        this.y=point.y;
    }
    public void  setPoint(Point point){
        this.point=point;
    }
    public Point getPoint(){
        return point;
    }
    public void setX1(int x1){
        this.x1=x1;
    }
    public double getX1(){
        return x1;
    }
    public void setY1(int y1){
        this.y1=y1;
    }
    public double getY1(){
        return y1;
    }
    public double length(){
        double lenght = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        return lenght;
    }
}
