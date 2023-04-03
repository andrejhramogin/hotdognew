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
    ADD_NEW_INGREDIENT("Add new ingredient to list."),
    INGREDIENT_CHOICE("Выберите ингридиенты: \n1 - булочка\n" +
            "2 - булочка 2\n" +
            "3 - горчица\n" +
            "4 - кетчуп\n" +
            "5 - майонез\n" +
            "6 - огурцы\n" +
            "7 - сосиска\n" +
            "8 - сосиска 2\n" +
            "9 - сосиска 3\n" +
            "Окончание выбора - нажмите любую букву");

    private final String message;

    UiMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

