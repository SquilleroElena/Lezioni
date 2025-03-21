public class Pitagorica {

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
    
}
