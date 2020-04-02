package service;

import model.Buget;
import repository.AngajatRepository;
import repository.BugetRepository;

import java.util.Set;

public class BugetService {

    private static BugetService instance;
    private BugetRepository repo;

    //constructor
    private BugetService(){
        repo = new BugetRepository();
    }
    public static BugetService getInstance(){
        if(instance == null){
            instance = new BugetService();
        }
        return instance;
    }



    public void add(Buget b){
        repo.add(b);
    }

    public void remove(Buget b){
        repo.remove(b);
    }

    public Buget getBugetByImpozit(float impozit){
        return repo.getBugetByImpozit(impozit);
    }

    public Buget getBugetByDatorii(float datorii){
        return repo.getBugetByDatorii(datorii);
    }

    public Set<Buget> getBugetbyTotalDepozit(float sum){
        return repo.getBugetbyTotalDepozit(sum);
    }

    public String printBugete(){
        return repo.printBugete();
    }

}
