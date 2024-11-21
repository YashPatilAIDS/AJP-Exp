import java.sql.*;

public class stmtinterface {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/";
            String db_name = "studentdb";
            String user_name = "root";
            String password = "IHATESQL";
            
            Connection connection = DriverManager.getConnection(url, user_name, password);
            System.out.println("Connection successful");

            String sql = "CREATE DATABASE IF NOT EXISTS " + db_name;
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("Database created successfully");

            url = url.concat(db_name);
            connection = DriverManager.getConnection(url, user_name, password);
            System.out.println("Connected to database");

            statement = connection.createStatement();
            sql = "CREATE TABLE IF NOT EXISTS student (ROLLNO int primary key, STUDNAME varchar(100), DEPT int);";
            statement.executeUpdate(sql);
            System.out.println("student table created successfully");

            sql = "INSERT INTO student (ROLLNO, STUDNAME, DEPT) VALUES (1, 'Himali', 18), (2, 'Rama', 17)";
            statement.executeUpdate(sql);
            System.out.println("Values inserted into table successfully");

            sql = "SELECT * FROM student;";
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("Contents of table student: ");
            while (rs.next()) {
                System.out.println("For roll number " + rs.getInt("ROLLNO"));
                System.out.println("Name: " + rs.getString("STUDNAME"));
                System.out.println("Dept: " + rs.getInt("DEPT"));
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
