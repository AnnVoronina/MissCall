import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {


    String group;

    public Map<String, List<Contact>> storage = new HashMap<>();


    public List<Contact> findContactsByGroup(String group) {

        return storage.get(group);

    }


    public Contact findContactByNumber(String number) {

        for (List<Contact> num : storage.values()) {
            for (Contact contact : num) {
                if (number.equals(contact.getPhoneNumber())) {
                    return contact;
                }
            }
        }
        return null;
    }

    public PhoneBook() {

    }

    public PhoneBook(Map<String, List<Contact>> storage) {

        this.storage = storage;
    }

    public void addGroup(String group) {
        if (!storage.containsKey(group)) {
            storage.put(group, new ArrayList<>());
        }
    }


    public void addContact(String group, Contact contact) {
        if (storage.get(group) == null) {
            addGroup(group);
        }
        storage.get(group).add(contact);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> str : storage.entrySet()) {   // почему тут добавили энтри?????
            sb.append("Group - ");
            sb.append(str.getKey());
            sb.append("\n");
            for (Contact cont : str.getValue()) {
                sb.append("Name - ");
                sb.append(cont.getName());
                sb.append("\n");
                sb.append("Phone:");
                sb.append(cont.getPhoneNumber());
                sb.append("\n");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}

