package service;

import model.Job;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class JobInputService{

    private static JobInputService instance;


    public JobInputService(){

    }
    public static JobInputService getInstance() {
        if (null == instance) {
            instance = new JobInputService();
        }
        return instance;
    }

    public Set<Job> citire(){

        Set<Job> jobs = new LinkedHashSet<>();


        String csvFile = "C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\TabelJoburi.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] date = line.split(cvsSplitBy);

                jobs.add(new Job(date[0], parseFloat(date[1]), parseFloat(date[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return jobs;

    }

}