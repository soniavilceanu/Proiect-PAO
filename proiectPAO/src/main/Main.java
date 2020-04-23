package main;

import model.*;
import repository.AngajatRepository;
import service.*;

import java.util.Set;

public class Main {
    public static void main(String[] args){

        AngajatService ang = AngajatService.getInstance();
        System.out.println(ang.printAngajati());


        AngajatInputService.getInstance().scriere();

        BugetService bug = BugetService.getInstance();
        System.out.println(bug.printBugete());


        CategorieProiectService cat = CategorieProiectService.getInstance();
        System.out.println(cat.printCategorieProiect());


        CheltuieliService chl = CheltuieliService.getInstance();
        System.out.println(chl.printCheltuieli());


        DepartamentService dep = DepartamentService.getInstance();
        System.out.println(dep.printDepartments());


        JobService job = JobService.getInstance();
        System.out.println(job.printJobs());


        ManagerService man = ManagerService.getInstance();
        System.out.println(man.printManageri());


        ProiectService pro = ProiectService.getInstance();
        System.out.println(pro.printProjects());

    }
}
