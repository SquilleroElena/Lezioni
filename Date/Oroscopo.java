
public class Oroscopo {
    public String data;

    public void segnoZodiacale(){
        String[] divisione = data.split(" ");
        int giorno = Integer.parseInt(divisione[0]);
        String mese = divisione[1].toLowerCase();

        if (giorno < 0) {
            System.out.println("Il giorno non esiste");
        } else if (mese.equals("gennaio")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 19) {
                System.out.println("Il segno zodiacale è Capricorno");
            } else {
                System.out.println("Il segno zodiacale è Acquario");
            }
        } else if (mese.equals("febbraio")) {
            if (giorno > 28) {
                System.out.println("La data non esiste");
            } else if (giorno <= 19) {
                System.out.println("Il segno zodiacale è Acquario");
            } else {
                System.out.println("Il segno zodiacale è Pesci");
            }
        } else if (mese.equals("marzo")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 20) {
                System.out.println("Il segno zodiacale è Pesci");
            } else {
                System.out.println("Il segno zodiacale è Ariete");
            }
        } else if (mese.equals("aprile")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else if (giorno <= 19) {
                System.out.println("Il segno zodiacale è Ariete");
            } else {
                System.out.println("Il segno zodiacale è Toro");
            }
        } else if (mese.equals("maggio")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 20) {
                System.out.println("Il segno zodiacale è Toro");
            } else {
                System.out.println("Il segno zodiacale è Gemelli");
            }
        } else if (mese.equals("giugno")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else if (giorno <= 20) {
                System.out.println("Il segno zodiacale è Gemelli");
            } else {
                System.out.println("Il segno zodiacale è Cancro");
            }
        } else if (mese.equals("luglio")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 22) {
                System.out.println("Il segno zodiacale è Cancro");
            } else {
                System.out.println("Il segno zodiacale è Leone");
            }
        } else if (mese.equals("agosto")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 23) {
                System.out.println("Il segno zodiacale è Leone");
            } else {
                System.out.println("Il segno zodiacale è Vergine");
            }
        } else if (mese.equals("settembre")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else if (giorno <= 22) {
                System.out.println("Il segno zodiacale è Vergine");
            } else {
                System.out.println("Il segno zodiacale è Bilancia");
            }
        } else if (mese.equals("ottobre")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 22) {
                System.out.println("Il segno zodiacale è Bilancia");
            } else {
                System.out.println("Il segno zodiacale è Scorpione");
            }
        } else if (mese.equals("novembre")) {
            if (giorno > 30) {
                System.out.println("La data non esiste");
            } else if (giorno <= 21) {
                System.out.println("Il segno zodiacale è Scorpione");
            } else {
                System.out.println("Il segno zodiacale è Saggitario");
            }
        } else if (mese.equals("dicembre")) {
            if (giorno > 31) {
                System.out.println("La data non esiste");
            } else if (giorno <= 21) {
                System.out.println("Il segno zodiacale è Saggitario");
            } else {
                System.out.println("Il segno zodiacale è Capricorno");
            }
        } else {
            System.out.println("Mese non esistente");
        }
    }
}
