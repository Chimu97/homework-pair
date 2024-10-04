package homework;

public class Main {
    public static void main (String[] args){
        Cat cat = new Cat("Garfield", "Munchkin");
        Bird bird = new Bird("Tweety", "Woodpecker");
        Snake snake = new Snake("Medusa", "cobra");

        bird.makeSound();
        System.out.println("The number of birds is: " + Bird.numberOfBirds);
        cat.makeSound();
        System.out.println("The number of cats is "+ Cat.numberOfCats);
        snake.makeSound();
        System.out.println("The number of snakes is " + Snake.numberOfSnakes);
        System.out.println("The number of animals is: " + Animal.numberOfAnimals);
        System.out.println("---------------------------");
        System.out.println("Team members: Shamuel Barrios, Fabián Ferreira, Alejandra Franco");

    }
}
