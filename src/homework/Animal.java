package homework;

public abstract class Animal {
    String name,breed;
    static int numberOfAnimals = 0;

    public Animal (String name, String breed){
        this.name = name;
        this.breed = breed;
        numberOfAnimals++;
    }

    public abstract void makeSound();

}
