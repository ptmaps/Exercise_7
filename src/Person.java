import java.util.Scanner;

public class Person {
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    public void initialize(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("ENTER First name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    public void print(){
       System.out.println("Surname: "+ surname);
       System.out.println("First Name: "+ firstName);
       System.out.println("Street "+ street);
       System.out.println("Zip Code: "+ zipCode);
       System.out.println("City: "+ city);
    }
}

class Staff extends Person{
    private String education;
    private String position;

    public void initialize10(){
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print0(){
        print();
        System.out.println("Education: "+ education);
        System.out.println("Position "+ position);
    }
}

