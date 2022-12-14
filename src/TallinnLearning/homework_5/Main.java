package TallinnLearning.homework_5;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Max";
        myDog.age = 3;
        myDog.color = "black";
        System.out.println("У нас есть собака по имени: " + myDog.name + " возвраст: " + myDog.age + " цвет: " + myDog.color);
        myDog.barking();

        Dog redDog = new Dog();
        System.out.println("У нас есть собака по имени: " + redDog.name + " возвраст: " + redDog.age + " цвет: " + redDog.color);
        System.out.println(redDog.barking2());

        Dog whiteDog = new Dog("Arctic", 4, "white");
        System.out.println("У нас есть собака по имени: " + whiteDog.name + " возвраст: " + whiteDog.age + " цвет: " + whiteDog.color);
        System.out.printf(whiteDog.barking2());
    }

}
