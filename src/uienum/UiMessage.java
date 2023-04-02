package uienum;

public enum UiMessage {

    RECIPE_LIST ("recipelist.bin"),
    INGREDIENT_LIST("ingredientlist.bin"),
    EMPTY_LIST ("List is empty."),
    NAME("Name: "),
    COST_PRICE("Cost price: "),
    RETAIL_PRICE("Retail price: "),
    RESERVE("Reserve: "),
    QUANTITY(" Quantity: "),
    NOT_INTEGER("You`d entered not an integer. Try agan."),
    NOT_DOUBLE("You`d entered not a fractional number. Try agan."),
    ADD_NEW_INGREDIENT("Add new ingredient to list.");

    private final String message;

    UiMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

