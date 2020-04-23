package service;

import model.Proiect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;



public class ProiectInputService{

    private static ProiectInputService instance;


    public ProiectInputService(){

    }
    public static ProiectInputService getInstance() {
        if (null == instance) {
            instance = new ProiectInputService();
        }
        return instance;
    }

    public Set<Proiect> citire(){

        Set<Proiect> pro = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelProiecte.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                pro.add(new Proiect(parseInt(date[0]), parseInt(date[1]), parseFloat(date[2]), date[3]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pro;

    }

}
