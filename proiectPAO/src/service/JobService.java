package service;

import model.Job;
import repository.AngajatRepository;
import repository.JobDBRepo;
import repository.JobRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class JobService {

    private static JobService instance;
    private JobDBRepo repo;

    //constructor
    private JobService(){
        repo = new JobDBRepo();
    }
    public static JobService getInstance(){
        if(instance == null){
            instance = new JobService();
        }
        return instance;
    }



    public void add(Job j){
        repo.add(j);
    }

    public Set<Job> getjobs() throws SQLException {
        return repo.getjobs();
    }

    public Job getJobByJobTitle(String job_title) throws SQLException {
        return repo.getJobByJobTitle(job_title);
    }

    public Job getJobById(int id) throws SQLException {
        return repo.getJobById(id);
    }
/*
    public Set<Job> getJobsbySalary(float salary){
        return repo.getJobsbySalary(salary);
    }*/

    public boolean setMinimumSalary(int id, float salary) throws SQLException {
        return repo.setMinimumSalary(id, salary);
    }

    public boolean setMaximumSalary(int id, float salary) throws SQLException {
        return repo.setMaximumSalary(id, salary);
    }

    public boolean removeById(int id){
        return repo.removeById(id);
    }
/*
    public String printJobs(){
        LogService.getInstance().writeInLog("printare joburi", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        return repo.printJobs();
    }
*/
}
