import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        String name = "";
        String surname = "";

        Person[] people = new Person[1000];

        int count = 0;

        for(int i = 0; count == 0 || !input.equalsIgnoreCase("quit"); i++){
            System.out.print("Vornamen: ");
            name = scanner.nextLine();

            System.out.print("Nachnamen: ");
            surname = scanner.nextLine();

            people[count] = new Person(name, surname);
            count++;

            System.out.println();
            System.out.printf("Zum beenden quit eingeben: ");
            input = scanner.nextLine();
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: %s\n", ++i, people[--i].getOutput());
        }
        System.out.printf("Instances: %s", Person.getInstances());
    }
}