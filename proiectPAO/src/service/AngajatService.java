package service;

import model.Angajat;
import repository.AngajatDBRepo;
import repository.AngajatRepository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

//clasa singleton

public class AngajatService {
    private static AngajatService instance;
    private AngajatDBRepo repo;

    //constructor
    private AngajatService(){
        repo = new AngajatDBRepo();
    }
    public static AngajatService getInstance(){
        if(instance == null){
            instance = new AngajatService();
        }
        return instance;
    }






    public Set<Angajat> getAngajati() throws SQLException {
        return repo.getAngajati();
    }
    public void add(Angajat a){
        LogService.getInstance().writeInLog("added angajat", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.add(a);
    }
    public void removeById(int id){
        LogService.getInstance().writeInLog("removed angajat", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.removeById(id);
    }
    public void remove(Angajat a) throws SQLException {
        LogService.getInstance().writeInLog("removed angajat", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        repo.remove(a);
    }


    public Set<Angajat> getAngajatiByLastName(String LastName) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati cu LastName", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatiByLastName(LastName);
    }
/*
    public Angajat getAngajatByLastName(String LastName) {
        LogService.getInstance().writeInLog("cautare primul angajat cu LastName", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatByLastName(LastName);
    }
      public Angajat getAngajatByFirstName(String FirstName) {
        LogService.getInstance().writeInLog("cautare primul angajat cu FirstName", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatByFirstName(FirstName);
    }


    */

    public Set<Angajat> getAngajatiByFirstName(String FirstName) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati cu FirstName", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatiByFirstName(FirstName);
    }


    public Angajat getAngajatById(int id) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati dupa Id", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatById(id);
    }

    public Set<Angajat> getAngajatiByDepartment(String department) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati dupa department", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.getAngajatiByDepartment(department);
    }

    public Set<Angajat> getAngajatiBySalary(float salary) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati dupa salary", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getAngajatiBySalary(salary);
    }

    public Set<Angajat> getAngajatiByJobId(int job_id) throws SQLException {
        LogService.getInstance().writeInLog("cautare angajati dupa jobId", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.getAngajatiByJobId(job_id);
    }

    public boolean setAngajatSalary(int id, float salary) throws SQLException {
        LogService.getInstance().writeInLog("setare salary pt angajat", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.setAngajatSalary(id, salary);
    }

    public boolean setAngajatJob(int id, int job_id) throws SQLException {
        LogService.getInstance().writeInLog("setare job angajat", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        return repo.setAngajatJob(id,job_id);
    }
/*
    public String printAngajati(){
        LogService.getInstance().writeInLog("printare angajati", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.printAngajati();
    }
*/
}
