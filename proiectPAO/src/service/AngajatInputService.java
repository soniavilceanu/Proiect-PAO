package service;
import model.Angajat;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;


import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class AngajatInputService{

    private static AngajatInputService instance;


    public AngajatInputService(){

    }
    public static AngajatInputService getInstance() {
        if (null == instance) {
            instance = new AngajatInputService();
        }
        return instance;
    }

    public Set<Angajat> citire(){

        Set<Angajat> ang = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelAngajati.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                ang.add(new Angajat(date[0], date[1], parseFloat(date[2]), date[3], parseInt(date[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ang;

    }


    public void scriere(){

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\AngajatiScrisi.csv");

            writer.append("First Name");
            writer.append(",");
            writer.append("Last Name");
            writer.append(",");
            writer.append("Department Name");
            writer.append(",");
            writer.append("Id");
            writer.append(",");
            writer.append("Salary");
            writer.append(",");
            writer.append("JobId");
            writer.append(",");
            writer.append("\n");


            Set<Angajat> ang = AngajatService.getInstance().getAngajati();

            for (Angajat a : ang) {
            writer.append(a.getFirstName()).append(",").append(a.getLastName()).append(",").append(a.getDepartmentName()).append(",");
            writer.append(String.valueOf(a.getId())).append(",").append(String.valueOf(a.getSalary())).append(",").append(String.valueOf(a.getJob_id()));
            writer.append("\n");

            }

            writer.flush();
            writer.close();
            LogService.getInstance().writeInLog("scriere angajati in fisier", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));


        } catch (final IOException | SQLException exception) {
            exception.printStackTrace();
        }
    }

}