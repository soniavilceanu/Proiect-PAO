package service;

import model.Angajat;
import model.Departament;
import repository.AngajatRepository;
import repository.DepartmentRepository;

import java.util.Set;


//clasa singleton

public class DepartamentService {
    private static DepartamentService instance;
    private DepartmentRepository repo;

    //constructor
    private DepartamentService(){
        repo = new DepartmentRepository();
    }
    public static DepartamentService getInstance(){
        if(instance == null){
            instance = new DepartamentService();
        }
        return instance;
    }


    public void add(Departament d){
        repo.add(d);
    }

    public Set<Departament> getDepartaments() {
        return repo.getDepartaments();
    }

    public Set<Departament> getDepartmentsByManagerId(int managerId){
        return repo.getDepartmentsByManagerId(managerId);
    }

    public Departament getDepartmentByName(String departmentName){
        return repo.getDepartmentByName(departmentName);
    }

    public Departament getDepartmentById(int id){
        return repo.getDepartmentById(id);
    }

    public Set<Departament> getDepartmentsByNrAngajati(int nrAngajati){
        return repo.getDepartmentsByNrAngajati(nrAngajati);
    }

    public boolean setDepartmentManager(int id, int managerId){
        return repo.setDepartmentManager(id,managerId);
    }

    public boolean removeById(int id){
        return repo.removeById(id);
    }

    public String printDepartments(){
        return repo.printDepartments();
    }

}

