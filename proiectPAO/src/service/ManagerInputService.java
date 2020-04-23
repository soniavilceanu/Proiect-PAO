package service;

import model.Manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;



public class ManagerInputService{

    private static ManagerInputService instance;


    public ManagerInputService(){

    }
    public static ManagerInputService getInstance() {
        if (null == instance) {
            instance = new ManagerInputService();
        }
        return instance;
    }

    public Set<Manager> citire(){

        Set<Manager> mng = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelManageri.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                mng.add(new Manager(date[0], date[1], date[2], parseFloat(date[3]), parseInt(date[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return mng;

    }

}