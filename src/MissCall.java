import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissCall {
    Map<LocalDateTime, String> missCall = new TreeMap<>();


    public void addMissCall(String number) {

        missCall.put(LocalDateTime.now(), number);

    }

    public void printMissCalls(PhoneBook phoneBook) {
        for (Map.Entry<LocalDateTime, String> mc : missCall.entrySet()) {
            Contact contact = phoneBook.findContactByNumber(mc.getValue());
            String name;
            if (contact == null) {
                name = mc.getValue();
            } else {
                name = contact.getName();
            }
            System.out.println(mc.getKey() + " " + name);
        }
    }
}
