package service;

import model.Cheltuieli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class CheltuieliInputService{

    private static CheltuieliInputService instance;


    public CheltuieliInputService(){

    }
    public static CheltuieliInputService getInstance() {
        if (null == instance) {
            instance = new CheltuieliInputService();
        }
        return instance;
    }

    public Set<Cheltuieli> citire(){

        Set<Cheltuieli> clt = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelCheltuieli.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                clt.add(new Cheltuieli(parseFloat(date[0]), parseFloat(date[1]), parseFloat(date[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return clt;

    }

}
