package homework;

public class Bird extends Animal {
    static int numberOfBirds = 0;

    public Bird(String name, String breed) {
        super(name, breed);
        numberOfBirds++;
    }
    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
