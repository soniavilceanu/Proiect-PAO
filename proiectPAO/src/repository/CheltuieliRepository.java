package repository;

import model.Cheltuieli;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheltuieliRepository {

    private Set<Cheltuieli> Cheltuieli;



    public CheltuieliRepository(){ Cheltuieli = new LinkedHashSet<>(); }

    public void add(Cheltuieli c){
        Cheltuieli.add(c);
    }
    public void remove(Cheltuieli c){ Cheltuieli.remove(c); }

    public Set<Cheltuieli> getCheltuieli() { return Cheltuieli; }



    public Cheltuieli getCheltuialaById(int id){
        for(Cheltuieli  c : Cheltuieli) {
            if(c.getId() == id) return c;
        }
        return null;
    }


    public Set<Cheltuieli> getCheltuielibyCommission(float commission){
        Set<Cheltuieli> Clt = null;
        for (Cheltuieli c : Cheltuieli) {
            if (c.getCommission() == commission)
                if (Clt != null) Clt.add(c);
                else Clt = new LinkedHashSet<>();
        }
        return Clt;
    }



    public String printCheltuieli(){
        String Clt="";
        for (Cheltuieli c : Cheltuieli)
            Clt += c.toStringy();
        return Clt;
    }
}
