package service;

import model.Cheltuieli;
import repository.AngajatRepository;
import repository.CheltuieliRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class CheltuieliService {

    private static CheltuieliService instance;
    private CheltuieliRepository repo;

    //constructor
    private CheltuieliService(){
        repo = new CheltuieliRepository();
    }
    public static CheltuieliService getInstance(){
        if(instance == null){
            instance = new CheltuieliService();
        }
        return instance;
    }


    public void add(Cheltuieli c){
        LogService.getInstance().writeInLog("added cheltuieli", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        repo.add(c);
    }

    public void remove(Cheltuieli c){
        LogService.getInstance().writeInLog("removed cheltuieli", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        repo.remove(c);
    }

    public Set<Cheltuieli> getCheltuieli() {
        LogService.getInstance().writeInLog("cautare cheltuieli", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCheltuieli();
    }

    public Cheltuieli getCheltuialaById(int id){
        LogService.getInstance().writeInLog("adaugare cheltuieli dupa id", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCheltuialaById(id);
    }

    public Set<Cheltuieli> getCheltuielibyCommission(float commission){
        LogService.getInstance().writeInLog("adaugare cheltuieli dupa comision", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCheltuielibyCommission(commission);
    }

    public String printCheltuieli(){
        LogService.getInstance().writeInLog("printare cheltuieli", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.printCheltuieli();
    }



    }
