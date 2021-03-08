public class PhoneBookApp {
    public static void main(String[] args) {
        int id=11, number = 123456789;
        String name = "Adam", surname = "Kowalski";
        boolean isMobile = false;

        printContactCard(id, name, surname, number);
        printContact(id, name, surname, number);

        PhoneNumber[] pn = new PhoneNumber[5];
        MobileNumber mn = new MobileNumber();
        PrivateNumber prn = new PrivateNumber();
        mn.printId();
        prn.printId();
        PhoneNumber.printNumCount();
    }
    public static void printContactCard(int id, String name, String surname, int number){
        System.out.format("\nId: %d\nImię: %s\nNazwisko: %s\nNumer: %d", id, name, surname, number);
    }
    public static void printContact(int id, String name, String surname, int number){
        System.out.format("\n%d | %s | %s | %d", id, name, surname, number);
    }


}
