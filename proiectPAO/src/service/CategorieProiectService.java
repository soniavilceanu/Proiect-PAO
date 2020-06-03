package service;

import model.CategorieProiect;
import repository.CategorieProiectDBRepo;
import repository.CategorieProiectRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class CategorieProiectService {

    private static CategorieProiectService instance;
    private CategorieProiectDBRepo repo;

    private CategorieProiectService(){
        repo = new CategorieProiectDBRepo();
    }

    public static CategorieProiectService getInstance(){
        if(instance == null) instance = new CategorieProiectService();
        return instance;
    }



    public void add(CategorieProiect cp){
        LogService.getInstance().writeInLog("added CategorieProiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.add(cp);
    }

    public void remove(CategorieProiect cp) throws SQLException {
        LogService.getInstance().writeInLog("removed CategorieProiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.remove(cp);
    }

    public Set<CategorieProiect> getCategorieProiect() throws SQLException {
        LogService.getInstance().writeInLog("cautare CategorieProiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCategorieProiect();
    }

    public CategorieProiect getCategorieProiectByName(String categoryName) throws SQLException {
        LogService.getInstance().writeInLog("cautare CategorieProiect dupa nume", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCategorieProiectByName(categoryName);
    }

    public CategorieProiect getCategorieProiectById(int id) throws SQLException {
        LogService.getInstance().writeInLog("cautare CategorieProiect dupa id", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getCategorieProiectById(id);
    }

    public boolean setCategoryName(int id, String name) throws SQLException {
        LogService.getInstance().writeInLog("setare nume CategorieProiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.setCategoryName(id,name);
    }

    public boolean removeById(int id){
        LogService.getInstance().writeInLog("remove CategorieProiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.removeById(id);
    }
/*
    public String printCategorieProiect(){
        LogService.getInstance().writeInLog("printare categorii proiect", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.printCategorieProiect();
    }
*/
}
