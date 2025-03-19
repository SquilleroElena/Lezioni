import java.util.*;
public class LezioniTest {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Lezioni lez = new Lezioni();
        System.out.println("Giorno, scritto nel formato GG MESE");
        lez.data = in.nextLine();
        lez.lezioni();

        in.close();
    }
}
