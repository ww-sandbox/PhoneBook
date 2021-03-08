package Contacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    private HashMap<Integer, PhoneContact> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap<Integer, PhoneContact>();
    }

    public void addContact(PhoneContact contact){
        Integer id = new Integer(contact.getId());
        phoneBook.put(id, contact);
    }

    public void removeContact(int idToRemove){
        Integer id = new Integer(idToRemove);
        phoneBook.remove(id);
    }

    public void printPhoneBook(){
        for(Integer id : phoneBook.keySet()){
            phoneBook.get(id).printContact();
        }
    }

    public void printPhoneBookCards(){
        for(Integer id : phoneBook.keySet()){
            phoneBook.get(id).printContactCard();
        }
    }

    public boolean backupPhoneBook(String filePath){
        File file = new File(filePath);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            for(Integer id : phoneBook.keySet()){
                fw.write(phoneBook.get(id).getContactRaw()+"\n");
            }

        } catch (IOException e) {
            System.out.println("Problem z obsługą pliku");
            e.printStackTrace();
            return false;
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Problem z obsługą pliku");
                    e.printStackTrace();
                    return false;
                }
            }
        }

        return true;
    }

    public boolean restorePhoneBook(String filePath){
        File file = new File(filePath);
        PhoneContact.resetNumCount();
        phoneBook.clear();
        PhoneContact contact;

        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()){
                contact = restoreContact(scan.nextLine());
                if(contact!=null) {
                    phoneBook.put(contact.getId(), contact);
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Plik nie odnaleziony");
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public PhoneContact restoreContact(String line) {
       String[] contact = line.split(";");
       String typeString = contact[contact.length-1];

        ContactType type = ContactType.valueOf(typeString);

        switch(type){
            case MOBI: {
                return new MobileContact(contact[1], contact[2], contact[4], Integer.parseInt(contact[3]));
            }
            case PRIV: {
                return new PrivateContact(contact[1], contact[2], contact[4], Integer.parseInt(contact[3]));
            }
            case WORK: {
                return new WorkContact(contact[1], contact[2], contact[4], Integer.parseInt(contact[3]));
            }
            default: {
                System.out.println("Nieprawidłowy typ numeru");
            }
        }
        return null;
    }
}
