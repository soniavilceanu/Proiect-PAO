package main;

import model.*;
import repository.AngajatRepository;
import service.*;

import java.sql.SQLException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws SQLException {

        AngajatService ang = AngajatService.getInstance();
        //System.out.println(ang.printAngajati());

        DepartamentService dep = DepartamentService.getInstance();
        //System.out.println(dep.printDepartments());


        JobService job = JobService.getInstance();
        //System.out.println(job.printJobs());


        CategorieProiectService cat = CategorieProiectService.getInstance();
        //System.out.println(cat.printCategorieProiect());


        System.out.println(ang.getAngajati());
        System.out.println(dep.getDepartaments());
        System.out.println(job.getjobs());
        System.out.println(cat.getCategorieProiect());


        //AngajatInputService.getInstance().scriere();

        BugetService bug = BugetService.getInstance();
        //System.out.println(bug.printBugete());


        CheltuieliService chl = CheltuieliService.getInstance();
       // System.out.println(chl.printCheltuieli());


        ManagerService man = ManagerService.getInstance();
        //System.out.println(man.printManageri());


        ProiectService pro = ProiectService.getInstance();
        //System.out.println(pro.printProjects());

    }
}
