public class Film {
    private String nazev;
    private int rok_vydani;
    private int hodnoceni;
    private Herec[] polehercu;
    public Film(String nazev, int rok_vydani, int hodnoceni, Herec[] polehercu) {
        this.nazev = nazev;
        this.rok_vydani = rok_vydani;
        this.hodnoceni = hodnoceni;
        this.polehercu = polehercu;
    }

    public String getNazev() {
        return nazev;
    }

    public int getRok_vydani() {
        return rok_vydani;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public Herec[] getPolehercu() {
        return polehercu;
    }
}
