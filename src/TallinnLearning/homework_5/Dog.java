package TallinnLearning.homework_5;

public class Dog {
        String name;
        int age;
        String color;

// Конструктор класса без аргументов
        public Dog(){
            this.name = "Clifford";
            this.age = 5;
            this.color = "red";
        }
// Конструктор класса с аргументами
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void barking() {
        System.out.println("Гав!");
        }

    // Метод возвращающий значение
        public String barking2() {
            return "Гав-гав-гав!";
        }
    }



