import java.io.Serializable;

public class Ingredient implements Serializable {
    public String name;
    public double costPrice; //себестоимость
    public double retailPrice;//розничная цена
    public int reserve; //запас продукта

    public int recipeQuantity; //количесвто шт/доз ингридиента в рецепте

    public Ingredient(String name, int recipeQuantity, double costPrice, double retailPrice, int quantity) {
        this.name = name;
        this.recipeQuantity = recipeQuantity;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.reserve = quantity;
    }

    public String toString() {
        return (name + " " + recipeQuantity + " " + costPrice + " " + retailPrice + " " + reserve + "\n");
    }

    public static void ingredientPrint(Ingredient i) {
        System.out.println(i.getName() + "");
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getReserve() {
        return reserve;
    }

    public int getRecipeQuantity() {
        return recipeQuantity;
    }
}