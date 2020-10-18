package creational;

import creational.builder.Meal;
import creational.builder.MealBuilder;

/*
 * Created by : vedikagupta
 * Date : 19/10/20
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMealWithPepsi = mealBuilder.prepareVegMealWithPepsi();
        Meal vegMealWithCoke = mealBuilder.prepareVegMealWithCoke();
        Meal nonVegMealWithCoke = mealBuilder.prepareNonVegMealWithCoke();
        Meal nonVegMealWithPepsi = mealBuilder.prepareNonVegMealWithPepsi();

        System.out.println("Veg Meal with Pepsi $" + vegMealWithPepsi.getCost());
        vegMealWithPepsi.showItems();
        System.out.println();
        System.out.println("Non Veg Meal with Coke $" + nonVegMealWithCoke.getCost());
        nonVegMealWithCoke.showItems();
        System.out.println();
        System.out.println("Veg Meal with Coke $" + vegMealWithCoke.getCost());
        vegMealWithCoke.showItems();
        System.out.println();
        System.out.println("Non Veg Meal with Pepsi $" + nonVegMealWithPepsi.getCost());
        nonVegMealWithPepsi.showItems();
    }
}
