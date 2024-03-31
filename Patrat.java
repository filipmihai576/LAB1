class Patrat extends Shape2D {
    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    double getArie() {
        return latura * latura;
    }
}