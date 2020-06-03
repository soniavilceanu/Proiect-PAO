package repository;

import model.Angajat;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class AngajatDBRepo {

    public AngajatDBRepo(){

    }
    public void add(Angajat a){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO angajat VALUES (NULL, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a.getFirstName());
            statement.setString(2, a.getLastName());
            statement.setString(3,a.getDepartmentName());
            statement.setFloat(4,a.getSalary());
            statement.setInt(5,a.getJob_id());

            statement.executeUpdate();

            statement.close();
            DBConnection.closeConnection(connection);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
    public void remove(Angajat a) throws SQLException{
        removeById(a.getId());
    }

    public Set<Angajat> getAngajati() throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat";
        PreparedStatement statement = connection.prepareStatement(sql);

        Set<Angajat> angajati = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else {
                angajati = new LinkedHashSet<>();
                angajati.add(ang);
            }
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }



    public Angajat getAngajatById(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();

        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));
        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }


    public Set<Angajat> getAngajatiByDepartment(String department) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE departmentName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,department);
        ResultSet result = statement.executeQuery();

        Set<Angajat> angajati = null;
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else angajati = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }


    public Set<Angajat> getAngajatiByLastName(String LastName) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE lastName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, LastName);

        Set<Angajat> angajati = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else angajati = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }


    public Set<Angajat> getAngajatiBySalary(float salary) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE salary = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setFloat(1, salary);

        Set<Angajat> angajati = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else angajati = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }

    public Set<Angajat> getAngajatiByFirstName(String FirstName) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE firstName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, FirstName);

        Set<Angajat> angajati = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else angajati = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }
    public Set<Angajat> getAngajatiByJobId(int job_id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM angajat WHERE job_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, job_id);

        Set<Angajat> angajati = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Angajat ang = new Angajat(result.getString(3),result.getString(2),result.getFloat(4),result.getString(1),result.getInt(5));

            if(angajati != null) angajati.add(ang);
            else angajati = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return angajati;
    }

        public boolean setAngajatSalary(int id, float salary) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE angajat SET salary = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setFloat(1, salary);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }
    public boolean setAngajatJob(int id, int job_id) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE angajat SET job_id = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, job_id);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }

    public boolean removeById(int id){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "DELETE FROM angajat WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            /*
            String sql = "SELECT COUNT(*) FROM angajat WHERE id = ?";

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
