# Burger Builder

A small Java project that shows the Builder design pattern on a burger example.

## What's inside

- Burger — the product itself, immutable
- BurgerBuilder — the builder interface with fluent setters
- ClassicBurgerBuilder and VeganBurgerBuilder — two concrete builders
- BurgerDirector — pre-defined recipes for common combinations
- Main — demo entry point

## How to run

In IntelliJ IDEA:
1. File -> Open -> select the Assignment1 folder
2. Open src/burger/Main.java
3. Click the green run arrow next to main

From the terminal:
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

## What it shows

- Step-by-step construction of a complex object
- Two different representations built with the same interface
- Validation in build() that throws when a required part is missing
- Fluent API where each setter returns the builder