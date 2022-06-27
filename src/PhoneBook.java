import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PhoneBook {
    public static Map<String, Contact> phones = new HashMap<>();
    public static Map<String, Groups> groups = new HashMap<>();
    public static void addGroup(String name) {
        Random random = new Random();
        int n = random.nextInt(256);
        groups.put(String.valueOf(n), new Groups(name));
    }
    public static void addContactGroup(String name, int phone) {
        Random random = new Random();
        int m = random.nextInt(256);
        phones.put(String.valueOf(m), new Contact(name, phone));
    }
}
