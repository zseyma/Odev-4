package IK;

public class Person {
    private String name;
    private String position;

    public Person(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position;
    }
}
