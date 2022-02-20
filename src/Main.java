import java.time.LocalDateTime;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<String, List<Contact>> storage = new HashMap<>();
        List<Contact> parents = new ArrayList<>();
        parents.add(new Contact("Ivanov Ivan", "889674839"));
        parents.add(new Contact("Petrov Petya", "5637833"));
        storage.put("Parents", parents);
        List<Contact> friends = new ArrayList<>();
        friends.add(new Contact("Tagir Tagirov", "4478950"));
        storage.put("Friends", friends);
        PhoneBook phoneBook = new PhoneBook(storage);
        phoneBook.addContact("Colleges", new Contact("Vasiliev Vasilii", "567845687"));

       MissCall calls = new MissCall();
       calls.addMissCall("8945764893");
       calls.addMissCall("889674839");
       calls.addMissCall("8896748544");
       calls.addMissCall("5637833");
       calls.addMissCall("8896745639");
       calls.addMissCall("8896745639");
       calls.addMissCall("8896745640");

       calls.printMissCalls(phoneBook);
    }


public static String enter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextLine();
        }

        }
