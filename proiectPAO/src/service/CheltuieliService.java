package service;

import model.Cheltuieli;
import repository.AngajatRepository;
import repository.CheltuieliRepository;

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
        repo.add(c);
    }

    public void remove(Cheltuieli c){
        repo.remove(c);
    }

    public Set<Cheltuieli> getCheltuieli() {
        return repo.getCheltuieli();
    }

    public Cheltuieli getCheltuialaById(int id){
        return repo.getCheltuialaById(id);
    }

    public Set<Cheltuieli> getCheltuielibyCommission(float commission){
        return repo.getCheltuielibyCommission(commission);
    }

    public String printCheltuieli(){
        return repo.printCheltuieli();
    }



    }
