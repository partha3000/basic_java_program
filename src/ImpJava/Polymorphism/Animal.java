package ImpJava.Polymorphism;

public class Animal {
    public static void main(String [] args){

    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void makeSound() {
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
}
