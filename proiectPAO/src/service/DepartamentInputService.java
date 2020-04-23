package service;

import model.Departament;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class DepartamentInputService{

    private static DepartamentInputService instance;


    public DepartamentInputService(){

    }
    public static DepartamentInputService getInstance() {
        if (null == instance) {
            instance = new DepartamentInputService();
        }
        return instance;
    }

    public Set<Departament> citire(){

        Set<Departament> dep = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelDepartamente.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                dep.add(new Departament(date[0], parseInt(date[1]), parseInt(date[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dep;

    }

}