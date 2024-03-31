class Adresă {
    private String stradă;
    private String oraș;
    private String codPoștal;

    public Adresă(String stradă, String oraș, String codPoștal) {
        this.stradă = stradă;
        this.oraș = oraș;
        this.codPoștal = codPoștal;
    }

    @Override
    public String toString() {
        return "Adresă{" +
                "stradă='" + stradă + '\'' +
                ", oraș='" + oraș + '\'' +
                ", codPoștal='" + codPoștal + '\'' +
                '}';
    }
}