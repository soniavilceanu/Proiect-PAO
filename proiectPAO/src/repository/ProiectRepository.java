package repository;

import model.Job;
import model.Proiect;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProiectRepository {
    private Set<Proiect> projects;



    public ProiectRepository(){ projects = new LinkedHashSet<>(); }

    public void add(Proiect p){
        projects.add(p);
    }
    public void remove(Proiect p){ projects.remove(p); }


    public Set<Proiect> getprojects() {
        return projects;
    }



    public Proiect getProjectByName(String projectName){
        for(Proiect  p : projects) {
            if(p.getProjectName() == projectName) return p;
        }
        return null;
    }
    public Set<Proiect> getProjectsByCategory(int categoryId){
        Set<Proiect> pro = null;
        for(Proiect p : projects){
            if(p.getCategoryId() == categoryId)
                if(pro != null) pro.add(p);
                else pro = new LinkedHashSet<>();
        }
        return pro;
    }

    public Proiect getProiectById(int id){
        for(Proiect p : projects){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    public Set<Proiect> getProjectsByFinancialResources(float financialResources){
        Set<Proiect> pro = null;
        for(Proiect p : projects){
            if(p.getFinancialResources() == financialResources)
                if(pro != null) pro.add(p);
                else pro = new LinkedHashSet<>();
        }
        return pro;
    }
    public boolean setProjectsFinancialResources(int id, float finances){
        Proiect p = getProiectById(id);

        if(p == null) return false;
        else p.setFinancialResources(finances);

        return true;

    }



    public boolean removeById(int id){
        Proiect p = getProiectById(id);
        if(p != null) {
            projects.remove(p);
            return true;
        }
        else return false;
    }

    public String printProjects(){
        String pro="";
        for (Proiect p : projects)
            pro += p.toStringy();
        return pro;
    }
}
