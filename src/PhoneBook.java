import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PhoneBook extends Contact {
    public static HashMap<String, List<Contact>> phones = new HashMap<>();
    public PhoneBook(String name, int phone) {
        super(name, phone);
    }
    public static void addGroup() {

    }
    public static void addContactGroup() {

    }
}
