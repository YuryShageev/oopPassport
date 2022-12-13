import java.time.LocalDate;

public class Passport {
    private String number;
    private String firstName;
    private String secondName;
    private String middleName;
    private LocalDate birthday;

    public Passport(String number, String firstName, String secondName, String middleName, LocalDate birthday) {
        this.number = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.birthday = birthday;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
