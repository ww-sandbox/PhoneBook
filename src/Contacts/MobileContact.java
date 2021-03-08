package Contacts;

public class MobileContact extends PhoneContact {
    public MobileContact(String name, String surname, String phoneNumber, int age){
        super(name, surname, phoneNumber, age);
    }

    @Override
    public void printContact() {
        System.out.println("Kontakt " + ContactType.MOBI.getFullname());
        super.printContact();
    }

    @Override
    public void printContactCard() {
        System.out.println("Kontakt " + ContactType.MOBI.getFullname());
        super.printContactCard();
    }

    @Override
    public String getContact() {
        return super.getContact() + ContactType.MOBI;
    }

    @Override
    public String getContactRaw() {
        return super.getContactRaw() + ";" + ContactType.MOBI;
    }
}
