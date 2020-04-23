package service;

import model.Buget;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class BugetInputService{

    private static BugetInputService instance;


    public BugetInputService(){

    }
    public static BugetInputService getInstance() {
        if (null == instance) {
            instance = new BugetInputService();
        }
        return instance;
    }

    public Set<Buget> citire(){

        Set<Buget> bug = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelBugete.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                bug.add(new Buget(parseFloat(date[0]), parseFloat(date[1]), parseFloat(date[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return bug;

    }

}
