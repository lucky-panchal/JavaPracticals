public class Practical7 {
    public static void main(String[] args) {
        Person person = new Person("Lucky",18 , 50000.0);
        person.displayInfo();
    }
}
class Person {
    private String name;
    private int age;
    private double salary;
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}