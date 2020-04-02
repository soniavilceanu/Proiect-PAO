package service;

import model.Manager;
import repository.AngajatRepository;
import repository.ManagerRepository;

import javax.print.DocFlavor;
import java.util.Set;

public class ManagerService {

    private static ManagerService instance;
    private ManagerRepository repo;

    //constructor
    private ManagerService(){
        repo = new ManagerRepository();
    }
    public static ManagerService getInstance(){
        if(instance == null){
            instance = new ManagerService();
        }
        return instance;
    }


    public void add(Manager m){
        repo.add(m);
    }

    public void remove(Manager m){
        repo.remove(m);
    }

    public Set<Manager> getManageri() {
        return repo.getManageri();
    }

    public Set<Manager> getManageriByLastName(String LastName){
        return repo.getManageriByLastName(LastName);
    }

    public Manager getManagerByLastName(String LastName){
        return repo.getManagerByLastName(LastName);
    }

    public Set<Manager> getManageriByFirstName(String FirstName){
        return repo.getManageriByFirstName(FirstName);
    }

    public Manager getManagerByFirstName(String FirstName){
        return repo.getManagerByFirstName(FirstName);
    }

    public Manager getManagerById(int id){
        return repo.getManagerById(id);
    }

    public Set<Manager> getManageriByDepartment(String department){
        return repo.getManageriByDepartment(department);
    }

    public Set<Manager> getManageriBySalary(float salary){
        return repo.getManageriBySalary(salary);
    }

    public Set<Manager> getManageriByJobId(float job_id){
        return repo.getManageriByJobId(job_id);
    }

    public Set<Manager> getManageriByNrProjects(int nrProjects) {
        return repo.getManageriByNrProjects(nrProjects);
    }

    public boolean setNrProiecte(int id, int nr){
        return repo.setNrProiecte(id, nr);
    }

    public boolean removeById(int id){
        return repo.removeById(id);
    }

    public String printManageri(){
        return repo.printManageri();
    }

}
