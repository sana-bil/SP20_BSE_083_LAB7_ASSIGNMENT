public class PizzaRunner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("medium", 4,2,1);
        Pizza p2 = new Pizza("small",3,2,1);
        PizzaOrder order = new PizzaOrder(p1,p2);
        System.out.println("total cost = " + order.calcTotal());
        order.display();

    }
}
