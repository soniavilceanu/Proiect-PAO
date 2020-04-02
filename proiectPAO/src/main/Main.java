package main;

import model.*;
import repository.AngajatRepository;
import service.*;

public class Main {
    public static void main(String[] args){


        AngajatService ang = AngajatService.getInstance();
        ang.add(new Angajat("finante", "Popescu", 5000, "Paul", 78));
        ang.add(new Angajat("economic", "Gigescu", 5000, "Gigi", 67));
        ang.add(new Angajat("transport", "Marinescu", 5000, "Maria", 34));
        ang.add(new Angajat("inventariat", "Ionescu", 5000, "Ion", 90));

        System.out.println(ang.printAngajati());


        BugetService bug = BugetService.getInstance();
        bug.add(new Buget((float) 0.2,500, 7000));
        bug.add(new Buget((float) 0.3,200, 9000));

        System.out.println(bug.printBugete());


        CategorieProiectService cat = CategorieProiectService.getInstance();
        cat.add(new CategorieProiect("baza de date"));
        cat.add(new CategorieProiect("aplicatie online"));
        cat.add(new CategorieProiect("joc video"));

        System.out.println(cat.printCategorieProiect());


        CheltuieliService chl = CheltuieliService.getInstance();
        chl.add(new Cheltuieli(0.1f, (float) 0.2, 600));
        chl.add(new Cheltuieli((float) 0.15, 0.05f, 800));

        System.out.println(chl.printCheltuieli());


        DepartamentService dep = DepartamentService.getInstance();
        dep.add(new Departament("finante", 56, 4));
        dep.add(new Departament("economic", 44, 2));
        dep.add(new Departament("transport", 55, 1));
        dep.add(new Departament("inventariat", 12, 10));

        System.out.println(dep.printDepartments());


        JobService job = JobService.getInstance();
        job.add(new Job(67,"finantator",900,1100));
        job.add(new Job(23,"programator",3000,5000));
        job.add(new Job(11,"economist",4000,5500));

        System.out.println(job.printJobs());


        ManagerService man = ManagerService.getInstance();
        man.add(new Manager("finante", "Jianu", "Mihai", 4500, 34));
        man.add(new Manager("transporturi", "Popescu", "Zaharia", 6700, 23));

        System.out.println(man.printManageri());


        ProiectService pro =ProiectService.getInstance();
        pro.add(new Proiect(3,45, 10000, "baze de date"));
        pro.add(new Proiect(5,20, 5000, "joc video"));

        System.out.println(pro.printProjects());






    }
}
