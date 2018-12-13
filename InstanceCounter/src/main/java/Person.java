public class Person {

    private String name = "";
    private String surname = "";
    private String output = "";

    private static int instances = 0;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        instances++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static int getInstances() {
        return instances;
    }

    public String getOutput() {
        output = getName() + " " + getSurname();

        return output;
    }
}