import Contacts.*;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneContact[] pn = new PhoneContact[5];
        MobileContact mn = new MobileContact("Adam", "Kowalski", "987456321", 22);
        PrivateContact prn = new PrivateContact("Jan", "Nowak", "111444777", 19);
        WorkContact wc = new WorkContact("Anna", "Dudek", "996633221", 25);
        mn.printId();
        prn.printId();
        PhoneContact.printNumCount();

        PhoneBook pb = new PhoneBook();
        pb.addContact(mn);
        pb.addContact(prn);
        pb.addContact(wc);

        pb.printPhoneBook();

    }



}
