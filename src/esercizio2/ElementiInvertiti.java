package esercizio2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementiInvertiti {

    private List<Integer> lista;

    public ElementiInvertiti(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public void inverti() {
        List<Integer> invertita = new ArrayList<Integer>(this.lista);
        Collections.reverse(invertita);
        System.out.println(this.lista + "" + invertita);

    }
}
