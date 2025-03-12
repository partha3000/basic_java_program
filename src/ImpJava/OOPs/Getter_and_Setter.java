package ImpJava.OOPs;

public class Getter_and_Setter {
    public static void main (String [] arg){

        // Creating an object of Person class
        Person person = new Person ("john Doe" , 25);

        // Retriving values using getters
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());

        // Modifying value using setters
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Update Name: " + person.getName());
        System.out.println("Update age: " + person.getAge());
    }
    public static class Person {
        // Private variables
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }
    }
}
