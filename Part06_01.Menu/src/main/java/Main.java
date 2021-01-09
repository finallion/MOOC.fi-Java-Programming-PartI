
public class Main {
    public static void main(String[] args) {
          Menu card = new Menu();
          card.addMeal("Fish");
          card.addMeal("Fish");
          card.printMeals();
          card.addMeal("Meat");
          card.printMeals();
          card.clearMenu();
          card.printMeals();
    }
}
