package Contacts;

public abstract class PhoneContact implements PrintableContact, StorableContact{
    private static int numCount = 0;
    private int id, age;
    private String name, surname, phoneNumber;
    private boolean isHidden = false;

    public PhoneContact(String name, String surname, String phoneNumber, int age){
        id = ++numCount;
        if (phoneNumber.length()==9){
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "000000000";
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void printId(){
        System.out.println(id);
    }

    public static void printNumCount(){
        System.out.println(numCount);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public static void resetNumCount() {
        PhoneContact.numCount = 0;
    }

    @Override
    public void printContact() {
        System.out.format("\n%d | %s | %s | %d | %s\n", id, name, surname, age, phoneNumber);
    }

    @Override
    public void printContactCard() {
        System.out.format("\nId: %d\nImię: %s\nNazwisko: %s\nWiek: %d\nNumer: %s\n", id, name, surname, age, phoneNumber);
    }

    @Override
    public String getContact() {
        return String.format("%d | %s | %s | %d | %s | %b", id, name, surname, age, phoneNumber, isHidden);
    }

    @Override
    public String getContactRaw() {
        return String.format("%d;%s;%s;%d;%s;%b", id, name, surname, age, phoneNumber, isHidden);
    }
}
