public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(){
        size=null;
        cheeseToppings=0;
        pepperoniToppings=0;
        hamToppings=0;
    }
    public Pizza(Pizza p){
        this.size=p.size;
        this.cheeseToppings=p.cheeseToppings;
        this.pepperoniToppings=p.pepperoniToppings;
        this.hamToppings=p.hamToppings;
    }
    public Pizza(String size, int cheeseToppings, int pepperoniToppings , int hamToppings){
        this.cheeseToppings=cheeseToppings;
        this.hamToppings=hamToppings;
        this.pepperoniToppings=pepperoniToppings;
        this.size=size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return size;
    }
    public void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings=cheeseToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings){
        this.pepperoniToppings=pepperoniToppings;
    }
    public void setHamToppings(int hamToppings){
        this.hamToppings=hamToppings;
    }
    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public int getPepperoniToppings(){
        return pepperoniToppings;
    }
    public int getHamToppings(){
        return hamToppings;
    }
    public double calcCost(){
        double cost;
        if (size=="small"){
            cost=10;
        }
        else if (size=="medium"){
            cost=12;
        }
        else if (size=="large"){
            cost=14;
        }
        else cost=0;
        double toppings = getCheeseToppings()+getPepperoniToppings()+getHamToppings();
        return cost+2*toppings;
    }
    public String getDescription(){
        return getSize()+" "+String.valueOf(getCheeseToppings() + " Cheese toppings "+ " " + String.valueOf(getPepperoniToppings()+" "+"Pepperoni topping" + " "+
                String.valueOf(getHamToppings()+ " ham toppings")));
    }
}
