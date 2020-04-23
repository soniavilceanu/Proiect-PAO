package service;

import model.Buget;
import repository.AngajatRepository;
import repository.BugetRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        LogService.getInstance().writeInLog("added buget", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.add(b);
    }

    public void remove(Buget b){
        LogService.getInstance().writeInLog("removed buget", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        repo.remove(b);
    }

    public Buget getBugetByImpozit(float impozit){
        LogService.getInstance().writeInLog("cautare buget dupa impozit", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getBugetByImpozit(impozit);
    }

    public Buget getBugetByDatorii(float datorii){
        LogService.getInstance().writeInLog("cautare buget dupa datorii", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getBugetByDatorii(datorii);
    }

    public Set<Buget> getBugetbyTotalDepozit(float sum){
        LogService.getInstance().writeInLog("cautare buget dupa suma totala din depozit", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getBugetbyTotalDepozit(sum);
    }

    public String printBugete(){
        LogService.getInstance().writeInLog("printare bugete", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.printBugete();
    }

}
