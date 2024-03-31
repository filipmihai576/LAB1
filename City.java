import java.util.*;

class City {
    private String name;
    private List<Hotel> hotels;

    public City(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotels;
    }

    public void displayAllTourists() {
        for (Hotel hotel : hotels) {
            System.out.println("Hotel: " + hotel.getName());
            for (Tourist tourist : hotel.getCurrentTourists()) {
                System.out.println("- " + tourist);
            }
        }
    }

    public boolean isPersonAccommodated(Person person) {
        for (Hotel hotel : hotels) {
            for (Tourist tourist : hotel.getCurrentTourists()) {
                if (tourist.equals(person)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "City: " + name;
    }
}
