import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Hrishikesh";
        person.dateOfBirth ="05/10/1993";
        person.nationality = "Indian";
        person.passport = new String[]{person.name , person.nationality, person.dateOfBirth };
        person.seatNumber = 12;

        System.out.println(person.name);
        System.out.println(person.dateOfBirth);
        System.out.println(person.nationality);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
       
    }
    
}
