package IK;
import java.util.ArrayList;
import java.util.List;

public class Department {

        private String name;
        private List<Person> employees;

        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        public void addEmployee(Person person) {
            employees.add(person);
        }

        public List<Person> getEmployees() {
            return employees;
        }

        public void printEmployees() {
            for (Person person : employees) {
                System.out.println(person);
            }
        }

}
