package burger;

import java.util.Collections;
import java.util.List;

public final class Burger {

    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final List<String> toppings;
    private final String sauce;

    Burger(String bun, String patty, boolean cheese,
           List<String> toppings, String sauce) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.toppings = List.copyOf(toppings);
        this.sauce = sauce;
    }

    public String getBun()            { return bun; }
    public String getPatty()          { return patty; }
    public boolean hasCheese()        { return cheese; }
    public List<String> getToppings() { return Collections.unmodifiableList(toppings); }
    public String getSauce()          { return sauce; }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}