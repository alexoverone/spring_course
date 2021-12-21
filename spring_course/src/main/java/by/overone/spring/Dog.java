package by.overone.spring;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Gaf-gaf");
    }
}
