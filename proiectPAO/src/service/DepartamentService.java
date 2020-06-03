package service;

import model.Angajat;
import model.Departament;
import repository.AngajatRepository;
import repository.DepartamentDBRepo;
import repository.DepartmentRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;


//clasa singleton

public class DepartamentService {
    private static DepartamentService instance;
    private DepartamentDBRepo repo;

    //constructor
    private DepartamentService(){
        repo = new DepartamentDBRepo();
    }
    public static DepartamentService getInstance(){
        if(instance == null){
            instance = new DepartamentService();
        }
        return instance;
    }


    public void add(Departament d){
        LogService.getInstance().writeInLog("added Departament", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        repo.add(d);
    }

    public Set<Departament> getDepartaments() throws SQLException {
        LogService.getInstance().writeInLog("cautare Departament", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getDepartaments();
    }

    public Set<Departament> getDepartmentsByManagerId(int managerId) throws SQLException {
        LogService.getInstance().writeInLog("cautare Departament dupa ManagerId", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getDepartmentsByManagerId(managerId);
    }

    public Departament getDepartmentByName(String departmentName) throws SQLException {
        LogService.getInstance().writeInLog("cautare Departament dupa Name", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getDepartmentByName(departmentName);
    }

    public Departament getDepartmentById(int id) throws SQLException {
        LogService.getInstance().writeInLog("cautare Departament dupa Id", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getDepartmentById(id);
    }
/*
    public Set<Departament> getDepartmentsByNrAngajati(int nrAngajati){
        LogService.getInstance().writeInLog("cautare Departament dupa nrAngajati", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getDepartmentsByNrAngajati(nrAngajati);
    }
*/
    public boolean setDepartmentManager(int id, int managerId) throws SQLException {
        LogService.getInstance().writeInLog("setare Manager Departament", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.setDepartmentManager(id,managerId);
    }

    public boolean removeById(int id){
        LogService.getInstance().writeInLog("removed Departament dupa Id", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.removeById(id);
    }
/*
    public String printDepartments(){
        LogService.getInstance().writeInLog("printare departamente", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.printDepartments();
    }
*/
}

