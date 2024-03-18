
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person extends EmployeeDetails {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person s = new Person();
        s.name = "Prateek S Patted";
        s.displayName();
        s.displayAge("17-04-2004");
        s.empdetails();
    }
}

