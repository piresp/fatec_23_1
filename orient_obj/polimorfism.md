dynamic polymorphism
``` java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
```


method overloading
``` java

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result1 = calculator.add(5, 10);
        System.out.println("Result 1: " + result1);
        
        double result2 = calculator.add(2.5, 3.7);
        System.out.println("Result 2: " + result2);
        
        String result3 = calculator.add("Hello", "World");
        System.out.println("Result 3: " + result3);
    }
}

```
