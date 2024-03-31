class Sfera extends Shape3D {
    private double raza;

    public Sfera(double raza) {
        this.raza = raza;
    }

    @Override
    double getVolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raza, 3);
    }
}
