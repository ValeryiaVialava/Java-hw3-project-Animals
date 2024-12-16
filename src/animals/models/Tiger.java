package animals.models;

public class Tiger extends Mammal implements Carnivorous {
    public Tiger(String name, int age, double weight) {
        super(name, age, weight, 4);
    }
    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}
