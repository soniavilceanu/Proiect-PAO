package repository;

import model.Job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

public class JobDBRepo {

    public JobDBRepo(){

    }


    public void add(Job a){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO job VALUES (NULL, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a.getJob_title());
            statement.setFloat(2,a.getMinSalary());
            statement.setFloat(3,a.getMaxSalary());

            statement.executeUpdate();

            statement.close();
            DBConnection.closeConnection(connection);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
    public void remove(Job a) throws SQLException {
        removeById(a.getJob_id());
    }

    public Set<Job> getjobs() throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM job";
        PreparedStatement statement = connection.prepareStatement(sql);

        Set<Job> Jobs = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Job ang = new Job(result.getString(1),result.getFloat(2),result.getFloat(3));

            if(Jobs != null) Jobs.add(ang);
            else Jobs = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return Jobs;
    }

    public Job getJobById(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM job WHERE job_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();

        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        Job ang = new Job(result.getString(1),result.getFloat(2),result.getFloat(3));
        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }

    public Job getJobByJobTitle(String jobTitle) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM job WHERE job_title = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,jobTitle);
        ResultSet result = statement.executeQuery();

        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        Job ang = new Job(result.getString(1),result.getFloat(2),result.getFloat(3));
        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }



/*
    public Set<Job> getJobsBySalary(String department) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM Job WHERE departmentName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,department);
        ResultSet result = statement.executeQuery();

        Set<Job> Jobi = null;
        while (result.next()){
            Job ang = new Job(result.getString(1),result.getString(2),result.getFloat(3),result.getString(4),result.getInt(5));

            if(Jobi != null) Jobi.add(ang);
            else Jobi = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return Jobi;
    }
*/
    public boolean setMinimumSalary(int id, float salary) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE job SET minSalary = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setFloat(1, salary);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }
    public boolean setMaximumSalary(int id, float salary) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE job SET maxSalary = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setFloat(1, salary);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }

    public boolean removeById(int id){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "DELETE FROM job WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            /*
            String sql = "SELECT COUNT(*) FROM Job WHERE id = ?";

            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();
            if(result.next())
                if (result.getInt(1) != 0)
                    {
                        DBConnection.closeConnection(connection);
                        return false;
                    }
*/            statement.setInt(1,id);

            statement.executeUpdate();
            statement.close();
            DBConnection.closeConnection(connection);
        } catch (Exception e)   {
            e.printStackTrace();
        }
        return true;
    }

}
