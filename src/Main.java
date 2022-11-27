import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Passport anna = new Passport(Collections.singleton("4015 789456"),
                "Орлова", "Анна", "Львовна", "25.12.1980");
        Passport igor = new Passport(Collections.singleton("8020 123456"),
                "Смирнов", "Игорь", null, "06.10.2001");
        Passport oleg = new Passport(Collections.singleton("3012 986532"),
                "Дмитриев", "Олег", "Петрович", "01.01.1991");
        Passport diana = new Passport(Collections.singleton("3012 986532"),
                "Данилова", "Диана", "Ивановна", "01.01.1991");
        Set<Passport> passportSets = new HashSet<>();
        passportSets.add(anna);
        passportSets.add(igor);
        passportSets.add(oleg);
        passportSets.add(diana);
        for (Passport passportSet : passportSets) {
            System.out.println(passportSet);
        }
        System.out.println("Данные паспорта - " + find(passportSets, "3012 986532"));
        System.out.println("Данные паспорта - " + find(passportSets, "1122 986532"));

    }

    public static Passport find(Set<Passport> passportSets, String number) {
        for (Passport passports : passportSets) {
            if (passports.isSetNumber(number)) {
                return passports;
            }
        }
        return null;
    }
}