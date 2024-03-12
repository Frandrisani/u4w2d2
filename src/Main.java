import esercizio2.ElementiInvertiti;
import esercizio2.OrdinatiNumeriRandom;
import esercizio2.TrueOFalse;

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
                Thread.sleep(500);
                System.out.println("Scegli il metodo da far eseguire: 1-- Ordina numeri random / 2-- Elementi invertiti / 3-- Pari/Dispari");
                int scelta2 = Integer.parseInt(sc.nextLine());
                if(scelta2==1){
                System.out.println("Inserisci un numero intero: ");
                int num = Integer.parseInt(sc.nextLine());
                if(num>0){
                OrdinatiNumeriRandom ordinati = new OrdinatiNumeriRandom(num);
                ordinati.random();
        }
                else{
            System.out.println("Errore");
        }}else if (scelta2==2){
                    System.out.println("Quanti elementi vuoi aggiungere nella lista?");
                    int numeroElementi = Integer.parseInt(sc.nextLine());
                    List<Integer> lista = new ArrayList<Integer>();
                    if(numeroElementi>0){
                        for(int i=0; i<numeroElementi; i++){
                            System.out.println("Inserisci un numero: ");
                            int num = Integer.parseInt(sc.nextLine());
                            if(num>0){
                                lista.add(num);
                            }
                        }
                        ElementiInvertiti invertiti = new ElementiInvertiti(lista);
                        invertiti.inverti();
                    }
                }else if (scelta2==3){
                    System.out.println("true / false");
                    String scelta3 = sc.nextLine();
                    System.out.println("Quanti elementi vuoi aggiungere nella lista?");
                    int numeroElementi = Integer.parseInt(sc.nextLine());
                    List<Integer> lista = new ArrayList<Integer>();
                    if(numeroElementi>0){
                        for(int i=0; i<numeroElementi; i++){
                            System.out.println("Inserisci un numero: ");
                            int num = Integer.parseInt(sc.nextLine());
                            if(num>0){
                                lista.add(num);
                            }
                        }
                        TrueOFalse listaperilpariodispari = new TrueOFalse(lista, scelta3);
                        listaperilpariodispari.pariodispari();
                    }
                }
                break;
            case 3:
                System.out.println("Eseguo il programma 3");
                Thread.sleep(500);
                Map<Integer, String> elencotelefonico = new HashMap<>();
                System.out.println("Quale operazione vuoi eseguire? 1-- Inserisci / 2-- Elimina / 3-- Ricerca per nome / 4-- Ricerca per numero / 5-- Visualizza tutta la lista");
                int sceltadellarubrica = Integer.parseInt(sc.nextLine());
                switch (sceltadellarubrica){
                    case 1:
                        break;

                }
                break;
            default:
                System.out.println("Errore");
                break;
        }
}
}
