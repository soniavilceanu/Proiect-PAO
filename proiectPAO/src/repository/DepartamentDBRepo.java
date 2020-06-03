package repository;

import model.Angajat;
import model.Departament;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

public class DepartamentDBRepo {
    
    public DepartamentDBRepo(){
        
    }

    public void add(Departament a){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO departament VALUES (NULL, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1,a.getDepartmentName());
            statement.setInt(2,a.getManagerId());


            statement.executeUpdate();

            statement.close();
            DBConnection.closeConnection(connection);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
    public void remove(Departament a) throws SQLException {
        removeById(a.getDepartmentId());
    }

    public Set<Departament> getDepartaments() throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM departament";
        PreparedStatement statement = connection.prepareStatement(sql);

        Set<Departament> Departaments = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Departament ang = new Departament(result.getString(2),result.getInt(3));

            if(Departaments != null) Departaments.add(ang);
            else Departaments = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return Departaments;
    }



    public Departament getDepartmentById(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM departament WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();

        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        Departament ang = new Departament(result.getString(1),result.getInt(2));
        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }


    public Set<Departament> getDepartmentsByManagerId(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM departament WHERE manager_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        Set<Departament> dep = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            Departament ang = new Departament(result.getString(1),result.getInt(2));

            if(dep != null) dep.add(ang);
            else dep = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return dep;
    }

    public Departament getDepartmentByName(String Name) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM departament WHERE departmentName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, Name);

        ResultSet result = statement.executeQuery();
        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        Departament ang = new Departament(result.getString(1),result.getInt(2));


        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }

    public boolean setDepartmentManager(int id, int manager_id) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE departament SET manager_id = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, manager_id);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }

    public boolean removeById(int id){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "DELETE FROM departament WHERE id = ?";

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
