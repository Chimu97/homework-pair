package homework;

public class Cat extends Animal {
    static int numberOfCats = 0;
    public Cat (String name, String breed){
        super(name,breed);
        numberOfCats++;
    }
    @Override
    public void makeSound (){
        System.out.println("Meow");
    }
}
