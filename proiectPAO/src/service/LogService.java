package service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;

public class LogService {

    private static LogService instance;


    private LogService() {

       //scrie in continuarea aceluiasi fisier

        if (!Files.exists(Paths.get("C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\LogInfo.csv"))) {
            try {
                Files.createFile(Paths.get("C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\LogInfo.csv"));
            } catch (final IOException exception) {
                exception.printStackTrace();
            } finally {
                try {
                    FileWriter writer = new FileWriter("C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\LogInfo.csv");

                    writer.append("Log");
                    writer.append(",");
                    writer.append("Time");
                    writer.append("\n");

                    writer.flush();
                    writer.close();

                } catch (final IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static LogService getInstance() {
        if (null == instance) {
            instance = new LogService();
        }
        return instance;
    }

    public void writeInLog(String actiune, String time) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Sonia\\IdeaProjects\\proiectPAO\\out\\production\\proiectPAO\\tabele csv\\LogInfo.csv", true);
            writer.append(actiune).append(",");
            writer.append(time);
            writer.append("\n");

            writer.flush();
            writer.close();

        } catch (final IOException exception) {
            exception.printStackTrace();
        }
    }
}
