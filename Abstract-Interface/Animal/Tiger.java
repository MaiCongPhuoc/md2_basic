package Animal;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Tiger: Roarrrrr!";
    }
    public String howToEat(){
        return "couldn't be fried";
    }
}
