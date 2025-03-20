public class Vacanze {

    public int anniDiServizio;
    public int[] anni;
    public int[] giorni;

    public void setVacanze() {
        this.anni = new int[] { 0, 1, 4, 6 };
        this.giorni = new int[] { 10, 15, 20, 25 };
    }

    public void mostraGiorniVacanze() {
        for (int i = 0; i < anni.length - 1; i++){
            if (anniDiServizio >= anni[i] && anniDiServizio < anni[i+1]){
                System.out.println("Gli anni di servisio sono stati: " + anniDiServizio + " -> i giorni di vanacaza sono quindi: " + giorni[i]);
            }
        }
        if (anniDiServizio >= anni[anni.length - 1]){
            System.out.println("Gli anni di servisio sono stati: " + anniDiServizio + " -> i giorni di vanacaza sono quindi: " + giorni[anni.length - 1]);
        }
    }

    
}