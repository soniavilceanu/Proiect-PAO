package model;

public class Job {

    private int job_id;
    private String job_title;
    private float minSalary;
    private float maxSalary;


    public float averageSalary(){
        return (minSalary + maxSalary)/2;
    }


    public Job(int job_id, String job_title, float minSalary, float maxSalary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;

    }


    public int getJob_id() {
        return job_id;
    }

    public float getMaxSalary() {
        return maxSalary;
    }

    public float getMinSalary() {
        return minSalary;
    }

    public String getJob_title() {
        return job_title;
    }




    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setMaxSalary(float maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }
    public String toStringy(){
        return "Date job:\nName: " + job_title + "\nid: " + job_id + "\nSalariu minim: " + minSalary + "\nSalariu maxim: " + maxSalary +"\n" + "\n";

    }

}
