public class Main {
    public static void main(String[] args) {
        // Crearea adresei și hotelurilor
        Address address1 = new Address("Street 1", "City 1");
        Address address2 = new Address("Street 2", "City 1");
        Address address3 = new Address("Street 3", "City 2");

        Hotel hotel1 = new Hotel("Hotel 1", address1);
        Hotel hotel2 = new Hotel("Hotel 2", address2);
        Hotel hotel3 = new Hotel("Hotel 3", address3);

        // Crearea unui turist și a unei persoane
        Tourist tourist1 = new Tourist("Tourist 1", address1, hotel1);
        Person person1 = new Person("Person 1", address2);

        // Adăugarea turistului la hotel și a hotelului la oraș
        hotel1.addTourist(tourist1);
        City city = new City("City 1");
        city.addHotel(hotel1);
        city.addHotel(hotel2);


        System.out.println(city.getAllHotels());
        city.displayAllTourists();

        // Verificarea dacă o persoană este cazată într-un hotel din oraș
        System.out.println("Is person accommodated in city hotels? " + city.isPersonAccommodated(person1));
    }
}