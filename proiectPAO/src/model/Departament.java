package model;

import repository.AngajatRepository;

public class Departament {

    private int nrAngajati;
    private int departmentId;
    private String departmentName;
    private int managerId;
    private AngajatRepository angajati;




    public Departament(String departmentName, int departmentId, int managerId){
        this.nrAngajati = 0;
        this.departmentId = departmentId;
        this.managerId = managerId;
        this.departmentName = departmentName;
    }

    //functii get

    public int getNrAngajati() {
        return nrAngajati;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getDepartmentName() {
        return departmentName;
    }




    public void addAngajat(Angajat a){
        angajati.add(a);
        nrAngajati ++;
    }
    public void removeAngajat(Angajat a){
        if (nrAngajati != 0) {
            angajati.remove(a);
            nrAngajati --;
        }
    }
    public AngajatRepository getAngajati() {
        return angajati;
    }






    ////////////////////////////////////////////////////////////////////
    // functii set
   // public void setNrAngajati(int nrAngajati) { this.nrAngajati = nrAngajati; }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String toStringy(){
        return "Date departament:\nName: " + departmentName + "\nid: " + departmentId + "\nmanager: " + managerId + "\nnr de angajati: " + nrAngajati +"\n" + "\n";

    }
}
