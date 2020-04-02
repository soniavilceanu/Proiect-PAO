package repository;

import model.Angajat;
import model.Departament;

import java.util.LinkedHashSet;
import java.util.Set;

public class DepartmentRepository {
    private Set<Departament> departaments;



    public DepartmentRepository(){
        departaments = new LinkedHashSet<>();
    }

    public void add(Departament d){ departaments.add(d); }
    //public void remove(Departament d){departaments.remove(d);}

    public Set<Departament> getDepartaments() {
        return departaments;
    }




    public Set<Departament> getDepartmentsByManagerId(int managerId){
        Set<Departament> dep = null;
        for(Departament d : departaments){
            if(d.getManagerId() == managerId)
                if(dep != null)dep.add(d);
                else dep = new LinkedHashSet<>();
        }
        return dep;
    }
    public Departament getDepartmentByName(String departmentName){
        for(Departament  d : departaments) {
            if(d.getDepartmentName().equals(departmentName)) return d;
        }
        return null;
    }
    public Departament getDepartmentById(int id){
        for(Departament d : departaments){
            if(d.getDepartmentId() == id)
                return d;
        }
        return null;
    }

    public Set<Departament> getDepartmentsByNrAngajati(int nrAngajati){
        Set<Departament> dep = null;
        for(Departament d : departaments){
            if(d.getNrAngajati() == nrAngajati)
                if(dep != null) dep.add(d);
                else dep = new LinkedHashSet<>();
        }
        return dep;
    }

    public boolean setDepartmentManager(int id, int managerId){
        Departament d = getDepartmentById(id);

        if(d == null) return false;
        else d.setManagerId(managerId);

        return true;

    }


    public boolean removeById(int id){
        Departament d = getDepartmentById(id);
        if(d != null) {
            departaments.remove(d);
            return true;
        }
        else return false;
    }

    public String printDepartments(){
        String dep="";
        for (Departament d : departaments)
            dep += d.toStringy();
        return dep;
    }
}







