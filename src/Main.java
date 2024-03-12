import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
       int scelta;
        System.out.println("Scegli l'esrizio da eseguire: 1 / 2 / 3");
        scelta = sc.nextInt();
        switch(scelta) {
            case 1:
                System.out.println("Eseguo il programma 1");
                Thread.sleep(5000);

                break;
            case 2:
                System.out.println("Eseguo il programma 2");
                break;
            case 3:
                System.out.println("Eseguo il programma 3");
                break;
            default:
                System.out.println("Errore");
                break;
        }
}
}
