package repository;

import model.CategorieProiect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

public class CategorieProiectDBRepo {
    
    public CategorieProiectDBRepo(){
        
    }


    public void add(CategorieProiect a){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO categorieproiect VALUES (NULL, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a.getCategoryName());
           // statement.setInt(5,a.getId());

            statement.executeUpdate();

            statement.close();
            DBConnection.closeConnection(connection);
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
    public void remove(CategorieProiect a) throws SQLException {
        removeById(a.getId());
    }

    public Set<CategorieProiect> getCategorieProiect() throws SQLException {
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM categorieproiect";
        PreparedStatement statement = connection.prepareStatement(sql);

        Set<CategorieProiect> CategoriiProiecte = null;
        ResultSet result = statement.executeQuery();
        while (result.next()){
            CategorieProiect ang = new CategorieProiect(result.getString(1));

            if(CategoriiProiecte != null) CategoriiProiecte.add(ang);
            else CategoriiProiecte = new LinkedHashSet<>();
        }

        statement.close();
        DBConnection.closeConnection(connection);
        return CategoriiProiecte;
    }



    public CategorieProiect getCategorieProiectById(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM categorieproiect WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();

        if(result.next())
            if (result.getInt(1) != 0)
            {
                DBConnection.closeConnection(connection);
                return null;
            }
        CategorieProiect ang = new CategorieProiect(result.getString(1));
        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }


    public CategorieProiect getCategorieProiectByName(String Name) throws SQLException{
        Connection connection = DBConnection.getConnection();
        String sql = "SELECT * FROM categorieproiect WHERE categoryName = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, Name);

        ResultSet result = statement.executeQuery();
        CategorieProiect ang = new CategorieProiect(result.getString(1));

        statement.close();
        DBConnection.closeConnection(connection);
        return ang;
    }

    public boolean setCategoryName(int id, String name) throws SQLException{

        Connection connection = DBConnection.getConnection();

        String sql = "UPDATE categorieproiect SET categoryName = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setInt(2,id);
        statement.executeUpdate();
        return true;

    }

    public boolean removeById(int id){
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "DELETE FROM categorieproiect WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            /*
            String sql = "SELECT COUNT(*) FROM CategorieProiect WHERE id = ?";

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
