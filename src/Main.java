import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("12342", "Петя", "Петечкин", "Петров", LocalDate.now().minusDays(-33)));
        passports.add(new Passport("12342", "Федя", "Федотов", "Петров", LocalDate.now().minusDays(-31)));

        PassportStorage passportStorage = new PassportStorage(passports);
        System.out.println(passportStorage);
    }
}
