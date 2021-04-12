public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    public PizzaOrder(){
        pizza1= new Pizza();
        pizza2= new Pizza();
        pizza3= new Pizza();
    }
    public PizzaOrder(Pizza p1){
        pizza1= new Pizza(p1);
        pizza2= new Pizza();
        pizza3= new Pizza();
    }
    public PizzaOrder(Pizza p1, Pizza p2){
        pizza1= new Pizza(p1);
        pizza2= new Pizza(p2);
        pizza3= new Pizza();
    }
    public PizzaOrder(Pizza p1 , Pizza p2 , Pizza p3){
        pizza1= new Pizza(p1);
        pizza2= new Pizza(p2);
        pizza3= new Pizza(p3);
    }
    public double calcTotal(){
        return this.pizza1.calcCost()+this.pizza2.calcCost()+this.pizza3.calcCost();
    }
    public void display(){
        System.out.println("   DETAILS OF THE PIZZAS ");
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
    }
}
