package service;

import model.CategorieProiect;
import repository.CategorieProiectRepository;

import java.util.Set;

public class CategorieProiectService {

    private static CategorieProiectService instance;
    private CategorieProiectRepository repo;

    private CategorieProiectService(){
        repo = new CategorieProiectRepository();
    }

    public static CategorieProiectService getInstance(){
        if(instance == null) instance = new CategorieProiectService();
        return instance;
    }



    public void add(CategorieProiect cp){
        repo.add(cp);
    }

    public void remove(CategorieProiect cp){
        repo.remove(cp);
    }

    public Set<CategorieProiect> getCategorieProiect(){
        return repo.getCategorieProiect();
    }

    public CategorieProiect getCategorieProiectByName(String categoryName){
        return repo.getCategorieProiectByName(categoryName);
    }

    public CategorieProiect getCategorieProiectById(int id){
        return repo.getCategorieProiectById(id);
    }

    public boolean setCategoryName(int id, String name){
        return repo.setCategoryName(id,name);
    }

    public boolean removeById(int id){
        return repo.removeById(id);
    }

    public String printCategorieProiect(){
        return repo.printCategorieProiect();
    }

}
