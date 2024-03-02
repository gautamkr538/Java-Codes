import java.sql.*;
public class JdbcCrud {
    public static void main (String args[]) {
        final String url= "jdbc:mysql://localhost:3306/MyDb";
        String user="root";
        String pwd="Gautam@20";
        String updateQuery="update student set stdmark=56 where stdid=1;";
        String selectQuery = "select * from student";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection established Successfully");
            Statement stmt= con.createStatement();
            stmt.executeUpdate(updateQuery);
            ResultSet rs= stmt.executeQuery(selectQuery);

            while(rs.next())
            {
                int Id= rs.getInt("Stdid");
                String Name= rs.getString("StdName");
                int Mark= rs.getInt("StdMark");

                System.out.println("Student ID:" + Id);
                System.out.println("Student Name:" + Name);
                System.out.println("Student Mark:" + Mark);

            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println("Connection Closed Successfully");

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
