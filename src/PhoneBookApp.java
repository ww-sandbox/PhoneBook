
public class PhoneBookApp {
    public static void main(String[] args) {
        int id=11, age=20;
        String name = "Adam", surname = "Kowalski", number = "123456789";
        boolean isMobile = false;
        ContactType type = ContactType.MOBI;

        printContact(id, name, surname, number, age);
        printContactCard(id, name, surname, number, age);
        System.out.println(getContact(id, name, surname, number, age, isMobile, type));
        System.out.println(getContactRaw(id, name, surname, number, age, isMobile, type));
    }

    public static void printContact(int id, String name, String surname, String phoneNumber, int age) {
        System.out.format("\n%d | %s | %s | %d | %s\n", id, name, surname, age, phoneNumber);
    }

    public static void printContactCard(int id, String name, String surname, String phoneNumber, int age) {
        System.out.format("\nId: %d\nImię: %s\nNazwisko: %s\nWiek: %d\nNumer: %s\n", id, name, surname, age, phoneNumber);
    }

    public static String getContact(int id, String name, String surname, String phoneNumber, int age, boolean isHidden, ContactType contactType) {
        return String.format("%d | %s | %s | %d | %s | %b | %s", id, name, surname, age, phoneNumber, isHidden, contactType);
    }

    public static String getContactRaw(int id, String name, String surname, String phoneNumber, int age, boolean isHidden, ContactType contactType) {
        return String.format("%d;%s;%s;%d;%s;%b;%s", id, name, surname, age, phoneNumber, isHidden, contactType);
    }

}
