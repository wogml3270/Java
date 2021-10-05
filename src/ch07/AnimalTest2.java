package ch07;

public class AnimalTest2 {
    public static void main(String[] args){
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 at2 = new AnimalTest2();

        at2.animalCrying(bc);
        at2.animalCrying(cat);
        at2.animalCrying(dog);
        at2.animalCrying(cow);

    }
    public void animalCrying(Animal ani){
        ani.crying();
    }
}
