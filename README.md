# Burger Builder

Demonstration of the **Builder** design pattern using a burger as an example.

## Structure

- `Burger` — the product (immutable)
- `BurgerBuilder` — builder interface with a fluent API
- `ClassicBurgerBuilder`, `VeganBurgerBuilder` — two concrete builders
- `BurgerDirector` — pre-defined recipes
- `Main` — demo entry point

## How to Run

IntelliJ IDEA:
1. File → Open → select the `Assignment1` folder
2. Open `src/burger/Main.java`
3. Click the green ▶ next to `main`

Terminal:
cd src
javac burger/*.java
java burger.Main

## Example

Burger burger = new ClassicBurgerBuilder()
.withBun("brioche")
.withPatty("beef")
.withCheese(true)
.withTopping("bacon")
.withSauce("bbq")
.build();

## What It Demonstrates

- Step-by-step construction of a complex object
- Two different representations (classic / vegan)
- Validation inside `build()` — throws an exception when bun or patty is missing
- Fluent API — every setter returns `this`