class Cerc extends Shape2D {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    double getArie() {
        return Math.PI * raza * raza;
    }
}