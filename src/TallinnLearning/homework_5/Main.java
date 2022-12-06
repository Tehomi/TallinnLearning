package TallinnLearning.homework_5;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Max";
        myDog.age = 3;
        myDog.color = "чёрный";
        System.out.println("У нас есть собака по имени: " + myDog.name + " возвраст: " + myDog.age + " цвет: " + myDog.color);
        myDog.barking();
        myDog.barking2();
        System.out.printf(myDog.barking2());
    }

}
