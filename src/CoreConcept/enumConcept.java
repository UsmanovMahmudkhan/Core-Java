package CoreConcept;

public class enumConcept {
    public static void main(String[] args) {
        Weekdays work=Weekdays.MONDAY;
        System.out.println(work);
        System.out.println(work.ordinal());
    }
}

enum Weekdays{
    MONDAY, TUESDAY, THURSDAY;
}

