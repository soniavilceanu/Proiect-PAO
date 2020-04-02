package repository;

import model.Angajat;

import java.util.LinkedHashSet;
import java.util.Set;

public class AngajatRepository {

    private Set<Angajat> angajati;



    public AngajatRepository(){ angajati = new LinkedHashSet<>(); }

    public void add(Angajat a){
        angajati.add(a);
    }
    public void remove(Angajat a){ angajati.remove(a); }


    public Set<Angajat> getAngajati() {
        return angajati;
    }


    public Set<Angajat> getAngajatiByLastName(String LastName){
        Set<Angajat> ang = null;
        for(Angajat a : angajati){
            if(a.getLastName().equals(LastName))
                if(ang != null) ang.add(a);
                else ang = new LinkedHashSet<>();
        }
        return ang;
    }
    public Angajat getAngajatByLastName(String LastName){
        for(Angajat  a : angajati) {
            if(a.getLastName().equals(LastName)) return a;
        }
        return null;
    }
    public Set<Angajat> getAngajatiByFirstName(String FirstName){
        Set<Angajat> ang = null;
        for(Angajat a : angajati){
            if(a.getFirstName().equals(FirstName))
                if(ang != null) ang.add(a);
                else ang = new LinkedHashSet<>();
        }
        return ang;
    }
    public Angajat getAngajatByFirstName(String FirstName){
        for(Angajat  a : angajati) {
            if(a.getFirstName().equals(FirstName)) return a;
        }
        return null;
    }
    public Angajat getAngajatById(int id){
        for(Angajat a : angajati){
            if(a.getId() == id)
                return a;
        }
        return null;
    }
    public Set<Angajat> getAngajatiByDepartment(String department){
        Set<Angajat> ang = null;
        for(Angajat a : angajati){
            if(a.getDepartmentName().equals(department))
                if(ang != null) ang.add(a);
                else ang = new LinkedHashSet<>();
        }
        return ang;
    }
    public Set<Angajat> getAngajatiBySalary(float salary){
        Set<Angajat> ang = null;
        for(Angajat a : angajati){
            if(a.getSalary() == salary)
                if(ang != null) ang.add(a);
                else ang = new LinkedHashSet<>();
        }
        return ang;
    }
    public Set<Angajat> getAngajatiByJobId(float job_id){
        Set<Angajat> ang = null;
        for(Angajat a : angajati){
            if(a.getJob_id() == job_id)
                if(ang != null) ang.add(a);
                else ang = new LinkedHashSet<>();
        }
        return ang;
    }
    public boolean setAngajatSalary(int id, float salary){
        Angajat a = getAngajatById(id);

        if(a == null) return false;
        else a.setSalary(salary);

        return true;

        }

    public boolean setAngajatJob(int id, int job_id){
        Angajat a = getAngajatById(id);

        if(a == null) return false;
        else a.setJob_id(job_id);

        return true;

    }



    public boolean removeById(int id){
        Angajat a = getAngajatById(id);
        if(a != null) {
            angajati.remove(a);
            return true;
        }
        else return false;
    }

    public String printAngajati(){
        String ang="";
        for (Angajat a : angajati)
            ang += a.toStringy();
        return ang;
    }
}
