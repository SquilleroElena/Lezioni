public class Vacanze {

    public int anniDiServizio;
    public int[] anni;
    public int[] giorni;

    public void setVacanze() {
        this.anni = new int[] { 0, 1, 4, 6 };
        this.giorni = new int[] { 10, 15, 20, 25 };
    }

    public void mostraGiorniVacanze() {
        if (anniDiServizio > giorni.length - 1) {
            System.out.println(
                    "Gli anni di servisio sono stati: " + anniDiServizio + " -> i giorni di vanacaza sono quindi: 25");
        } else {
            System.out.println(
                    "Gli anni di servisio sono stati: " + anniDiServizio + " -> i giorni di vanacaza sono quindi: "
                            + giorni[anniDiServizio]);
        }
    }

    
}