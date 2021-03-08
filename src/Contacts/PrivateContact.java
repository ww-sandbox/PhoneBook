package Contacts;

public class PrivateContact extends PhoneContact {
    public PrivateContact(String name, String surname, String phoneNumber, int age){
        super(name, surname, phoneNumber, age);
    }

    @Override
    public void printContact() {
        System.out.println("Kontakt " + ContactType.PRIV.getFullname());
        super.printContact();
    }

    @Override
    public void printContactCard() {
        System.out.println("Kontakt " + ContactType.PRIV.getFullname());
        super.printContactCard();
    }

    @Override
    public String getContact() {
        return super.getContact() + ContactType.PRIV;
    }

    @Override
    public String getContactRaw() {
        return super.getContactRaw() + ";" + ContactType.PRIV;
    }
}
