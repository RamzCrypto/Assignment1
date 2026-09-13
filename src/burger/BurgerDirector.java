package burger;

public class BurgerDirector {

    public Burger makeClassicCheeseburger(BurgerBuilder builder) {
        return builder
                .withBun("sesame")
                .withPatty("beef")
                .withCheese(true)
                .withTopping("lettuce")
                .withTopping("tomato")
                .withTopping("pickles")
                .withSauce("ketchup")
                .build();
    }

    public Burger makeVeganDeluxe(BurgerBuilder builder) {
        return builder
                .withBun("whole grain")
                .withPatty("chickpea")
                .withCheese(false)
                .withTopping("avocado")
                .withTopping("rucola")
                .withSauce("vegan mayo")
                .build();
    }
}