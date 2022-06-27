public class Groups {
    String name;

    public Groups(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "( " + name + " )";
    }
}
