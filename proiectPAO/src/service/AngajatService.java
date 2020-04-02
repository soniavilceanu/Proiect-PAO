package service;

import model.Angajat;
import repository.AngajatRepository;
import java.util.LinkedHashSet;
import java.util.Set;

//clasa singleton

public class AngajatService {
    private static AngajatService instance;
    private AngajatRepository repo;

    //constructor
    private AngajatService(){
        repo = new AngajatRepository();
    }
    public static AngajatService getInstance(){
        if(instance == null){
            instance = new AngajatService();
        }
        return instance;
    }






    public Set<Angajat> getAngajati(){
        return repo.getAngajati();
    }
    public void add(Angajat a){
        repo.add(a);
    }
    public void removeById(int id){
        repo.removeById(id);
    }
    public void remove(Angajat a){
        repo.remove(a);
    }


    public Set<Angajat> getAngajatiByLastName(String LastName){
        return repo.getAngajatiByLastName(LastName);
    }

    public Angajat getAngajatByLastName(String LastName){
        return repo.getAngajatByLastName(LastName);
    }

    public Set<Angajat> getAngajatiByFirstName(String FirstName){
        return repo.getAngajatiByFirstName(FirstName);
    }

    public Angajat getAngajatByFirstName(String FirstName){
        return repo.getAngajatByFirstName(FirstName);
    }

    public Angajat getAngajatById(int id){
        return repo.getAngajatById(id);
    }

    public Set<Angajat> getAngajatiByDepartment(String department){
        return repo.getAngajatiByDepartment(department);
    }

    public Set<Angajat> getAngajatiBySalary(float salary){
        return repo.getAngajatiBySalary(salary);
    }

    public Set<Angajat> getAngajatiByJobId(float job_id){
        return repo.getAngajatiByJobId(job_id);
    }

    public boolean setAngajatSalary(int id, float salary){
        return repo.setAngajatSalary(id, salary);
    }

    public boolean setAngajatJob(int id, int job_id){
        return repo.setAngajatJob(id,job_id);
    }

    public String printAngajati(){
        return repo.printAngajati();
    }

}
