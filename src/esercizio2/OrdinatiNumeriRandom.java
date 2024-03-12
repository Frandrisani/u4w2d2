package esercizio2;

import java.util.Set;
import java.util.TreeSet;

public class OrdinatiNumeriRandom {
    private int intero;

    public OrdinatiNumeriRandom(int intero) {
        this.intero=intero;
}

    public int getIntero() {
        return intero;
}

public void setIntero(int intero) {
    this.intero = intero;
}

public void random(){
        Set<Integer> database = new TreeSet<>();
        for (int i=0; i<this.intero; i++){
            int random = (int) (Math.random()*100);
            database.add(random);
        }
        for (int i : database){
            System.out.println(i);
}

}

}

