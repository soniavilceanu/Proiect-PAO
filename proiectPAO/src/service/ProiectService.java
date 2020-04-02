package service;

import model.Proiect;
import repository.AngajatRepository;
import repository.ProiectRepository;

import java.util.Set;

public class ProiectService {

    private static ProiectService instance;
    private ProiectRepository repo;

    //constructor
    private ProiectService(){
        repo = new ProiectRepository();
    }
    public static ProiectService getInstance(){
        if(instance == null){
            instance = new ProiectService();
        }
        return instance;
    }



    public void add(Proiect p){
        repo.add(p);
    }

    public void remove(Proiect p){
        repo.remove(p);
    }

    public Set<Proiect> getprojects() {
        return repo.getprojects();
    }

    public Proiect getProjectByName(String projectName){
        return repo.getProjectByName(projectName);
    }

    public Set<Proiect> getProjectsByCategory(int categoryId){
        return repo.getProjectsByCategory(categoryId);
    }

    public Proiect getProiectById(int id){
        return repo.getProiectById(id);
    }

    public Set<Proiect> getProjectsByFinancialResources(float financialResources){
        return repo.getProjectsByFinancialResources(financialResources);
    }

    public boolean setProjectsFinancialResources(int id, float finances){
        return repo.setProjectsFinancialResources(id, finances);
    }

    public boolean removeById(int id){
        return repo.removeById(id);
    }

    public String printProjects(){
        return repo.printProjects();
    }

}
