import java.util.Set;

public class PassportStorage {

    private Set<Passport> passports;

    public PassportStorage(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add(Passport passport) {
        Passport old = get(passport.getNumber());
        if (old != null) {
            passports.remove(old);
        }
        passports.add(passport);
    }

    public Passport get(String number) {
        for (Passport passport : passports) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}
