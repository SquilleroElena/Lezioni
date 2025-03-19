import java.util.Scanner;

public class OroscopoTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Oroscopo segno = new Oroscopo();
        System.out.println("Giorno, scritto nel formato GG MESE");
        segno.data = in.nextLine();
        segno.segnoZodiacale();
        ;

        in.close();
    }

}
