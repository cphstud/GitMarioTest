package mario.cph;

public class Pizza {
    String navn;
    String ingredienser;
    int pris;

    public Pizza(String navn, String ingredienser, int pris) {
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public int getPris() {
        return pris;
    }
}
