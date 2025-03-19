public class Lezioni {

    public String data;

    public void lezioni(){
        String[] divisione = data.split(" ");
        int giorno = Integer.parseInt(divisione[0]);
        String mese = divisione[1].toLowerCase();

        if (mese.equals("gennaio")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else {
                System.out.println("Il corso non è ancora stato avviato");
            }
        } else if (mese.equals("febbraio")){
            if (giorno > 28) {
                System.out.println("La data non esiste");
            } else if (giorno <= 12){
                System.out.println("Il corso non è ancora stato avviato");
            } else {
                System.out.println("La lezione è stata Web");
            }
        } else if (mese.equals("marzo")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 4) {
                System.out.println("La lezione è stata Web");
            } else if (giorno == 5) {
                System.out.println("La lezione è stata DASA");
            } else if (giorno >= 6 && giorno <= 10) {
                System.out.println("La lezione è stata Java");
            } else if (giorno == 11) {
                System.out.println("La lezione è stata GitHub");
            } else {
                System.out.println("La lezione è stata Java");
            }
        } else if (mese.equals("aprile")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else if (giorno <= 8) {
                System.out.println("La lezione è stata Java");
            } else if (giorno >= 9 && giorno <= 17) {
                System.out.println("La lezione è stata Database");
            } else if (giorno == 21 || giorno == 22) {
                System.out.println("È un giorno festivo");
            } else if (giorno >= 18 && giorno <= 23) {
                System.out.println("La lezione è stata JDBC");
            } else {
                System.out.println("La lezione è stata Spring");
            }
        } else if (mese.equals("maggio")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno == 1) {
                System.out.println("È un giorno festivo");
            } else if (giorno <= 8) {
                System.out.println("La lezione è stata Spring");
            } else if (giorno >= 9 && giorno <= 21) {
                System.out.println("La lezione è stata Project Work");
            } else {
                System.out.println("Il corso è terminato");
            }
        } else if (mese.equals("giugno") ||mese.equals("settembre") || mese.equals("novembre")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else {
                System.out.println("Corso non presente");
            }
            
        } else if (mese.equals("luglio") || mese.equals("agosto") || mese.equals("ottobre") || mese.equals("dicembre")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else {
                System.out.println("Corso non presente");
            }
        } else {
            System.out.println("Mese non esistente");
        }

    }
    
}