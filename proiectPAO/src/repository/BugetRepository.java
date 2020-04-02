package repository;

import model.Buget;

import java.util.LinkedHashSet;
import java.util.Set;

public class BugetRepository {

    private Set<Buget> bugete;



    public BugetRepository(){ bugete = new LinkedHashSet<>(); }

    public void add(Buget b){
        bugete.add(b);
    }
    public void remove(Buget b){ bugete.remove(b); }

    public Set<Buget> getBugete() { return bugete; }



    public Buget getBugetByImpozit(float impozit){
        for(Buget  b : bugete) {
            if(b.getImpozit() == impozit) return b;
        }
        return null;
    }

    public Buget getBugetByDatorii(float datorii){
        for(Buget b : bugete){
            if(b.getDatorii() == datorii)
                return b;
        }
        return null;
    }
    public Set<Buget> getBugetbyTotalDepozit(float sum){
        Set<Buget> bug = null;
        for (Buget b : bugete) {
            if (b.getTotalDepozit() == sum)
                if (bug != null) bug.add(b);
                else bug = new LinkedHashSet<>();
        }
        return bug;
    }



    public String printBugete(){
        String bug="";
        for (Buget b : bugete)
            bug += b.toStringy();
        return bug;
    }
    
}
