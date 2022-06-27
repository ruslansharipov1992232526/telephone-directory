public class Contact {
    String name;
    int phone;
    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "( " + name + " -> " + phone +  " )";
    }
}
