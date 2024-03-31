import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private Address address;
    private List<Tourist> currentTourists;

    public Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
        this.currentTourists = new ArrayList<>();
    }

    public void addTourist(Tourist tourist) {
        currentTourists.add(tourist);
    }

    public void removeTourist(Tourist tourist) {
        currentTourists.remove(tourist);
    }

    public List<Tourist> getCurrentTourists() {
        return currentTourists;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Hotel: " + name + ", Address: " + address;
    }
}
