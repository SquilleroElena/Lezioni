public class Fibonacci {


    public void mostraSequenza() {

        int uno = 0;
        int due = 1;
        System.out.print(uno + " - " + due);
        
        while ((uno + due) < 100) {
            if (uno < due){
                uno += due;
                System.out.print(" - " + uno);
            } else{
                due += uno;
                System.out.print(" - " + due);
            }
        }
    }
    
}
