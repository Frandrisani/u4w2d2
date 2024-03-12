import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
       int scelta;
        System.out.println("Scegli l'esrizio da eseguire: 1 / 2 / 3");
        scelta = Integer.parseInt(sc.nextLine());
        switch(scelta) {
            case 1:
                System.out.println("Eseguo il programma 1");
                Thread.sleep(500);
                Set<String> parole = new HashSet<String>();
                try {
                    System.out.println("Inserisci un numero intero: ");
                    int num = Integer.parseInt(sc.nextLine());
                    if(num>0){
                        for(int i=0; i<num; i++){
                            System.out.println("Inserisci una parola: ");
                            parole.add(sc.nextLine()) ;
                    }
                    }
                    else{
                        System.out.println("Errore");
                }
                System.out.println("Parole inserite: ");
                for (String s : parole) {
                    System.out.println(s);
                }
                }catch (Exception e) {
                    System.err.println (e.getMessage());
        }
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
