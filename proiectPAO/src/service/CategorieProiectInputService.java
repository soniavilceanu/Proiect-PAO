package service;

import model.CategorieProiect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class CategorieProiectInputService{

    private static CategorieProiectInputService instance;


    public CategorieProiectInputService(){
    }

    public static CategorieProiectInputService getInstance() {
        if (null == instance) {
            instance = new CategorieProiectInputService();
        }
        return instance;
    }

    public Set<CategorieProiect> citire(){

        Set<CategorieProiect> ctp = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelCategorii.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                ctp.add(new CategorieProiect(date[0]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ctp;

    }

}