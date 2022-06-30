import java.util.*;
public class PhoneBook {
    public static Map<String, Contact> phones = new HashMap<>();
    public static Map<String, Contact> groupsAndContact = new HashMap<>();
    public static HashMap<String, Object> groups = new HashMap();
    public static void addContact(String name, int phone) {
        Random random = new Random();
        int i = random.nextInt();
        phones.put(String.valueOf(i), new Contact(name, phone));
    }
    public static void search(String name) {
//        Object obj = new Object();
//        for (Map.Entry<String, Object> entry : groups.entrySet()) {
//            if (obj.equals(entry.getValue())) {
//                return entry.getKey();
//            }
//        }
    }
}
