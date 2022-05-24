package Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: luck-luck!";
    }
    public String howToEat(){
        return "could be fried";
    }
}
