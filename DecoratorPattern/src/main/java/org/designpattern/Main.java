package org.designpattern;

import org.designpattern.beverage.Beverage;
import org.designpattern.beverage.Espresso;
import org.designpattern.beverage.Mocha;
import org.designpattern.beverage.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}