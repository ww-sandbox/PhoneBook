package Contacts;

public class WorkContact extends PhoneContact{
    public WorkContact(String name, String surname, String phoneNumber, int age){
        super(name, surname, phoneNumber, age);
    }

    @Override
    public void printContact() {
        System.out.println("Kontakt " + ContactType.WORK.getFullname());
        super.printContact();
    }

    @Override
    public void printContactCard() {
        System.out.println("Kontakt " + ContactType.WORK.getFullname());
        super.printContactCard();
    }

    @Override
    public String getContact() {
        return super.getContact() + ContactType.WORK;
    }

    @Override
    public String getContactRaw() {
        return super.getContactRaw() + ";" + ContactType.WORK;
    }
}
