public class LineRunner {
    public static void main(String[] args) {
        Point p = new Point(2, 6);
        Line l1 = new Line(33,6,p);
        System.out.println("Lenght of line 1 = " + l1.length());
        Line l2 = new Line(55,98,p);
        System.out.println("Length of line 2 = " + l2.length());
    }
}
