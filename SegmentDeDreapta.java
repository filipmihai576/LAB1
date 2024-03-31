class SegmentDeDreapta implements Shape {
    private double lungime;

    public SegmentDeDreapta(double lungime) {
        this.lungime = lungime;
    }

    @Override
    public double getPerimetru() {
        return lungime;
    }
}