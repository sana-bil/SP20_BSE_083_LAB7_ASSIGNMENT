public class Point {
     double x;
     double y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double getY() {
        return y;
    }
    public void display(){
        System.out.println("x-cord= "+ x);
        System.out.println("y-cord= "+ y);
    }
}
