class Tourist extends Person {
    private Hotel currentHotel;

    public Tourist(String name, Address address, Hotel currentHotel) {
        super(name, address);
        this.currentHotel = currentHotel;
    }

    public void moveHotel(Hotel newHotel) {
        this.currentHotel = newHotel;
    }

    public Hotel getCurrentHotel() {
        return currentHotel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Current Hotel: " + currentHotel.getName();
    }
}