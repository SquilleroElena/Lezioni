import java.util.Scanner;

public class Pitagorica {

    public int x;
    public int y;

    public void mostraTavola() {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                if ((j*i) < 10){
                    System.out.print("   " + j*i);
                } else if ((j*i) >= 10 && (j * i) < 100){
                    System.out.print("  " + j*i);
                } else {
                    System.out.print(" " + j * i);
                }
                
            }
            System.out.println();
        }
    }

    public void mostraTavolaScelta() {

        Scanner input = new Scanner(System.in);
        System.out.println("Scegli l'altezza: ");
        x = input.nextInt();
        System.out.println("Scegli la larghezza: ");
        y = input.nextInt();

        if (y <= 32 && x * y < 10000){
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    if ((j * i) < 10) {
                        System.out.print("    " + j * i);
                    } else if ((j * i) >= 10 && (j * i) < 100) {
                        System.out.print("   " + j * i);
                    } else if ((j * i) >= 100 && (j * i) < 1000) {
                        System.out.print("  " + j * i);
                    } else {
                        System.out.print(" " + j * i);
                    }

                }
                System.out.println();
            }
        } else{
            System.out.println("I numeri inseriti non sono validi");
        }

        
    }
    
}
