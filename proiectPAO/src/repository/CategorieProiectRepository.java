package repository;

import model.CategorieProiect;
import model.Job;

import java.util.LinkedHashSet;
import java.util.Set;

public class CategorieProiectRepository {

    private Set<CategorieProiect> CategorieProiect;



    public CategorieProiectRepository(){ CategorieProiect = new LinkedHashSet<>(); }



    public void add(CategorieProiect cp){
        CategorieProiect.add(cp);
    }
    public void remove(CategorieProiect cp){ CategorieProiect.remove(cp); }


    public Set<CategorieProiect> getCategorieProiect() {
        return CategorieProiect;
    }



    public CategorieProiect getCategorieProiectByName(String categoryName){
        for(CategorieProiect  cp : CategorieProiect) {
            if(cp.getCategoryName() == categoryName) return cp;
        }
        return null;
    }


    public CategorieProiect getCategorieProiectById(int id){
        for(CategorieProiect cp : CategorieProiect){
            if(cp.getId() == id)
                return cp;
        }
        return null;
    }
    public boolean setCategoryName(int id, String name){
        CategorieProiect cp = getCategorieProiectById(id);

        if(cp == null) return false;
        else cp.setCategoryName(name);

        return true;

    }



    public boolean removeById(int id){
        CategorieProiect cp = getCategorieProiectById(id);
        if(cp != null) {
            CategorieProiect.remove(cp);
            return true;
        }
        else return false;
    }

    public String printCategorieProiect(){
        String catPro="";
        for (CategorieProiect cp : CategorieProiect)
            catPro += cp.toStringy();
        return catPro;
    }
}
