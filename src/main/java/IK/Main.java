package IK;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("IT Department");

        Person person1 = new Person("Mehmet Keskin", "Software Engineer");
        Person person2 = new Person("Duru Aslan", "Project Manager");

        department.addEmployee(person1);
        department.addEmployee(person2);

        department.printEmployees();
    }
}
