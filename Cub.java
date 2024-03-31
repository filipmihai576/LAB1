class Cub extends Shape3D {
    private double latura;

    public Cub(double latura) {
        this.latura = latura;
    }

    @Override
    double getVolum() {
        return Math.pow(latura, 3);
    }
}