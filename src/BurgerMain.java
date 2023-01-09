public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger ("Bun,", " Meat,", " Cheese, ", "Salad, ", "Mayonnaise. ");
        Burger burger2 = new Burger ("Bun,", " Meat,", " Cheese, ", "Salad. ");
        Burger burger3 = new Burger ("Bun ,", " Meat,", " Cheese. ");


        burger.burgerInfo();
        burger2.burgerInfo();
        burger3.burgerInfo();

    }
}