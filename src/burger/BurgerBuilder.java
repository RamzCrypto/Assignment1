package burger;

public interface BurgerBuilder {

    BurgerBuilder withBun(String bun);
    BurgerBuilder withPatty(String patty);
    BurgerBuilder withCheese(boolean cheese);
    BurgerBuilder withTopping(String topping);
    BurgerBuilder withSauce(String sauce);

    Burger build();
}