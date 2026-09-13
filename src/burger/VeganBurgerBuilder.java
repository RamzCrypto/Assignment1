package burger;

import java.util.ArrayList;
import java.util.List;

public class VeganBurgerBuilder implements BurgerBuilder {

    private String bun;
    private String patty;
    private boolean cheese;
    private final List<String> toppings = new ArrayList<>();
    private String sauce;

    @Override
    public BurgerBuilder withBun(String bun) {
        this.bun = bun;
        return this;
    }

    @Override
    public BurgerBuilder withPatty(String patty) {
        if (patty != null && patty.toLowerCase().contains("beef")) {
            throw new IllegalArgumentException("Vegan burger cannot contain beef.");
        }
        this.patty = patty;
        return this;
    }

    @Override
    public BurgerBuilder withCheese(boolean cheese) {
        if (cheese) {
            throw new IllegalArgumentException("Vegan burger cannot contain dairy cheese.");
        }
        this.cheese = false;
        return this;
    }

    @Override
    public BurgerBuilder withTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public BurgerBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public Burger build() {
        validate();
        return new Burger(bun, patty, false, toppings, sauce);
    }

    private void validate() {
        if (bun == null || bun.isBlank()) {
            throw new IllegalStateException("Bun is required before building a vegan burger.");
        }
        if (patty == null || patty.isBlank()) {
            throw new IllegalStateException("Patty is required before building a vegan burger.");
        }
    }
}