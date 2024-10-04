package homework;

public class Snake extends Animal {

    public static int numberOfSnakes = 0;

    public Snake(String name, String breed){
       super(name, breed);
       numberOfSnakes++;
    }

    @Override
    public void makeSound(){
        System.out.println("Ssssssss");

    }

    public static int getTotalSnakes(){
        return numberOfSnakes;
    }

}
