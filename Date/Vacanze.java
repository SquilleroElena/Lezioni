public class Vacanze {

    public int anniDiServizio;
    public int[] anni;
    public int[] giorni;

    public void setVacanze() {
        giorni = new int[6];
        giorni[0] = 10;
        giorni[1] = 15;
        giorni[2] = 15;
        giorni[3] = 15;
        giorni[4] = 20;
        giorni[5] = 20;
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