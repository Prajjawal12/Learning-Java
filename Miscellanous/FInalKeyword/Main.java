package Miscellanous.FInalKeyword;
//final keyword in java can be applied to methods,variables or classes
//we cannot have setter functions for variables having final keyword
//since constructors are not inherited,hence final keyword is not allowed with constructors.
public class Main {
    //when a variable is declared final,it's value cannot be changed once initialized
    public static final int limit = 100;

    //when used with methods,it cannot be overriden by subclasses
    public final void greeting() {
        System.out.println("Welcome, you are in Main class!");
    }

    //a class declared final will not allow itself to have subclasses,it can be used to precent inheritance
}

