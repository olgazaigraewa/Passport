import lombok.Getter;
import java.util.Objects;
import java.util.Set;
@Getter


public class Passport {
    private final Set<String> passportNumbers;
    private final String surName;
    private final String name;
    private final String lastName;
    private final String dateOfBirth;

    public Passport(Set<String> passportNumbers, String surName, String name, String lastName, String dateOfBirth) {
        this.passportNumbers = passportNumbers;
        if (surName == null || surName.isEmpty() || surName.isBlank())
            throw new RuntimeException("Фамилия заполнена некорректно");
        this.surName = surName;
        if (name == null || name.isEmpty() || name.isBlank()) throw new RuntimeException("Имя заполнено некорректно");
        this.name = name;
        this.lastName = lastName;
        if (dateOfBirth == null || dateOfBirth.isEmpty() || dateOfBirth.isBlank())
            throw new RuntimeException("Имя заполнено некорректно");
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSetNumber(String s) {
        return passportNumbers.contains(s);
    }

    public String print(String s) {
        for (String passport1 : passportNumbers) {
            return passport1;
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumbers == passport.passportNumbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumbers);
    }

    @Override
    public String toString() {
        return "Паспорт: " + passportNumbers.toString().replace("[", " ").replace("]", "") +
                ", фамилия - " + surName +
                ", имя - " + name +
                ", отчество - " + lastName +
                ", дата рождения - " + dateOfBirth;

    }


}
