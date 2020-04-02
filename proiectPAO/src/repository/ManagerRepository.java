package repository;

import model.Job;
import model.Manager;

import java.util.LinkedHashSet;
import java.util.Set;

public class ManagerRepository {
    private Set<Manager> Manageri;



    public ManagerRepository(){ Manageri = new LinkedHashSet<>(); }

    public void add(Manager m){
        Manageri.add(m);
    }
    public void remove(Manager m){ Manageri.remove(m); }


    public Set<Manager> getManageri() {
        return Manageri;
    }


    public Set<Manager> getManageriByLastName(String LastName){
        Set<Manager> mng = null;
        for(Manager m : Manageri){
            if(m.getLastName().equals(LastName))
                if(mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;
    }
    public Manager getManagerByLastName(String LastName){
        for(Manager  m : Manageri) {
            if(m.getLastName() == LastName) return m;
        }
        return null;
    }
    public Set<Manager> getManageriByFirstName(String FirstName){
        Set<Manager> mng = null;
        for(Manager m : Manageri){
            if(m.getFirstName().equals(FirstName))
                if(mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;
    }
    public Manager getManagerByFirstName(String FirstName){
        for(Manager  m : Manageri) {
            if(m.getLastName().equals(FirstName)) return m;
        }
        return null;
    }
    public Manager getManagerById(int id){
        for(Manager m : Manageri){
            if(m.getId() == id)
                return m;
        }
        return null;
    }
    public Set<Manager> getManageriByDepartment(String department){
        Set<Manager> mng = null;
        for(Manager m : Manageri){
            if(m.getDepartmentName().equals(department))
                if(mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;
    }
    public Set<Manager> getManageriBySalary(float salary){
        Set<Manager> mng = null;
        for(Manager m : Manageri){
            if(m.getSalary() == salary)
                if(mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;
    }
    public Set<Manager> getManageriByJobId(float job_id){
        Set<Manager> mng = null;
        for(Manager m : Manageri){
            if(m.getJob_id() == job_id)
                if(mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;
    }
    public Set<Manager> getManageriByNrProjects(int nrProjects) {
        Set<Manager> mng = null;
        for (Manager m : Manageri) {
            if (m.getNrProjects() == nrProjects)
                if (mng != null) mng.add(m);
                else mng = new LinkedHashSet<>();
        }
        return mng;

    }
    public boolean setNrProiecte(int id, int nr){
        Manager m = getManagerById(id);

        if(m == null) return false;
        else m.setNrProjects(nr);

        return true;

    }



    public boolean removeById(int id){
        Manager m = getManagerById(id);
        if(m != null) {
            Manageri.remove(m);
            return true;
        }
        else return false;
    }

    public String printManageri(){
        String mng="";
        for (Manager m : Manageri)
            mng += m.toStringy();
        return mng;
    }
}
