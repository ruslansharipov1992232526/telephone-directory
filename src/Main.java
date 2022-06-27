public class Main {
    public static void main(String[] args) {
        PhoneBook.addGroup("Home");
        PhoneBook.addGroup("Home");
        PhoneBook.addGroup("Home");

        PhoneBook.addContactGroup("Ruslan", 87542315);

        for (Groups ct : PhoneBook.groups.values()) {
            System.out.println(ct);
        }

        for (Contact con : PhoneBook.phones.values()) {
            System.out.println(con);
        }
    }
}
