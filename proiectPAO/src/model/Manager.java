package model;

import repository.AngajatRepository;
import repository.ProiectRepository;

public class Manager extends Angajat {


    private int nrProjects;
    private ProiectRepository proiecte;



   //constructor
    public Manager(String departmentName, String LastName, String FirstName, float Salary, int job_id){
        super(departmentName, LastName,Salary,FirstName, job_id);
        this.nrProjects = 0;
    }

    public int getNrProjects() { return nrProjects; }
    public void setNrProjects(int nrProjects) { this.nrProjects = nrProjects; }
    public void setProjects(ProiectRepository Projects) { this.proiecte = Projects; }




    public void addProject(Proiect p){
        proiecte.add(p);
        nrProjects ++;
    }
    public void removeProject(Proiect p){
        if (nrProjects != 0) {
            proiecte.remove(p);
            nrProjects --;
        }
    }
    public ProiectRepository getProjects() {
        return proiecte;
    }

}



