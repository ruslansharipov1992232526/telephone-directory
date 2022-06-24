import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook extends Contact {
    public PhoneBook(String name, int phone) {
        super(name, phone);
    }
    public static void a() {
        HashMap<String, Integer> phones = new HashMap<>();
        phones.put("Ruslan", 22);
        phones.put("tol", 22);
        phones.put("Russalan", 22);
        phones.put("Ruslawqn", 22);
        System.out.println(phones);

    }
}
