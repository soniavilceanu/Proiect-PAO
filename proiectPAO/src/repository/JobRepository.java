package repository;

import model.Angajat;
import model.Job;

import java.util.LinkedHashSet;
import java.util.Set;

public class JobRepository {
    private Set<Job> jobs;



    public JobRepository(){ jobs = new LinkedHashSet<>(); }

    public void add(Job j){
        jobs.add(j);
    }
    //public void remove(Job j){ jobs.remove(j); }

    public Set<Job> getjobs() { return jobs; }



    public Job getJobByJobTitle(String job_title){
        for(Job  j : jobs) {
            if(j.getJob_title() == job_title) return j;
        }
        return null;
    }

    public Job getJobById(int id){
        for(Job j : jobs){
            if(j.getJob_id() == id)
                return j;
        }
        return null;
    }
    public Set<Job> getJobsbySalary(float salary){
        Set<Job> job_uri = null;
        for (Job j : jobs) {
            if (j.averageSalary() == salary)
                if (job_uri != null) job_uri.add(j);
                else job_uri = new LinkedHashSet<>();
        }
        return job_uri;
    }
    public boolean setMinimumSalary(int id, float salary){
        Job j = getJobById(id);

        if(j == null) return false;
        else j.setMinSalary(salary);

        return true;

    }
    public boolean setMaximumSalary(int id, float salary){
        Job j = getJobById(id);

        if(j == null) return false;
        else j.setMaxSalary(salary);

        return true;

    }





    public boolean removeById(int id){
        Job j = getJobById(id);
        if(j != null) {
            jobs.remove(j);
            return true;
        }
        else return false;
    }

    public String printJobs(){
        String job_uri="";
        for (Job j : jobs)
            job_uri += j.toStringy();
        return job_uri;
    }
}
