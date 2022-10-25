interface AnimalEat{
    void eat();
}
interface AnimalTravel {
    void travel();
}
class Animal implements AnimalEat,AnimalTravel{
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void travel() {
        System.out.println("Animal is travel");
    }
}
public class Multiple_inheritance {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.travel();
    }
}