import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PhoneBook extends Contact {
    public PhoneBook(String name, int phone) {
        super(name, phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public static void a() {
        HashMap<String, List<Contact>> phones = new HashMap<>();
        phones.put("Ruslan", 22);
        phones.put("tol", 22);
        phones.put("Russalan", 22);
        phones.put("Ruslawqn", 22);
        System.out.println(phones);

    }
}
