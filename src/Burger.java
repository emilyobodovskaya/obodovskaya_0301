
public class Burger {
    String bun;
    String meat;
    String  cheese;
    String salad;
    String mayonnaise;
    public Burger (String a, String b, String c, String d, String e) {
        bun = a;
        meat = b;
        cheese = c;
        salad = d;
        mayonnaise = e;
        System.out.println("Basic Burger include : "+ bun + meat + cheese+ salad + mayonnaise) ;
    }

    public Burger (String a, String b  , String c, String d) {
        bun = a;
        meat = b;
        cheese = c;
        salad = d;
        System.out.println("Diet Burger include : "+ bun + meat + cheese+ salad) ;
    }
    public Burger (String a, String b  , String c) {
        bun = a;
        meat = b;
        cheese = c;
        System.out.println("Meat Burger include : "+ bun + "double portion of "+ meat + cheese) ;
    }
    public void burgerInfo() {


    }
}