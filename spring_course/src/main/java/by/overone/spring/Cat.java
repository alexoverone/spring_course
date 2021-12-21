package by.overone.spring;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
