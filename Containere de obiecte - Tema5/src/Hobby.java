import java.util.List;

class Hobby {
    private String name;
    private int frequency;
    private List<Address> practiceAddresses;

    public Hobby(String name, int frequency, List<Address> practiceAddresses) {
        this.name = name;
        this.frequency = frequency;
        this.practiceAddresses = practiceAddresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getPracticeAddresses() {
        return practiceAddresses;
    }
}