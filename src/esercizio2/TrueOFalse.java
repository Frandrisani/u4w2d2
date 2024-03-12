package esercizio2;

import java.util.List;
import java.util.Objects;

public class TrueOFalse {
    private List<Integer> lista;
    private String scelta;

    public TrueOFalse(List<Integer> lista, String scelta) {
        this.lista =lista;
        this.scelta =scelta;
}

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public String isScelta() {
        return scelta;
    }

    public void pariodispari(){
        if(Objects.equals(scelta, "true")){
            for(int i=0; i<lista.size(); i++){ if (lista.get(i) % 2 != 0) {
                lista.remove(i);
                i--;
            }
            }
                System.out.println("Lista pari: " + lista);
        }
        }
    }


