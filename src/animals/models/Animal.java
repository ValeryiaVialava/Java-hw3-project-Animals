package animals.models;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected String species;
    public Animal() {}
    public void eat(){
        System.out.println("I'm eating...");
    }
    public void sleep(){
     System.out.println("I'm sleeping...");
    }
    public abstract void whoAmI();
}
