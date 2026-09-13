package burger;

public class Main {

    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        Burger classic = director.makeClassicCheeseburger(new ClassicBurgerBuilder());
        System.out.println("Classic: " + classic);

        Burger vegan = director.makeVeganDeluxe(new VeganBurgerBuilder());
        System.out.println("Vegan:   " + vegan);

        Burger custom = new ClassicBurgerBuilder()
                .withBun("brioche")
                .withPatty("chicken")
                .withCheese(true)
                .withTopping("bacon")
                .withSauce("bbq")
                .build();
        System.out.println("Custom:  " + custom);

        try {
            new ClassicBurgerBuilder().withPatty("beef").build();
        } catch (IllegalStateException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}