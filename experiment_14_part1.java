import java.sql.*;

public class preparedstmt {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/studentdb";
            String user_name = "root";
            String password = "IHATESQL";
            Connection con = DriverManager.getConnection(url, user_name, password);
            System.out.println("Connected to database");

            String sql = "SELECT * FROM student WHERE ROLLNO = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            // Assuming ROLLNO is an integer
            ps.setInt(1, 102);

            ResultSet rs = ps.executeQuery();
            System.out.println("Contents of table student: ");

            if (rs.next()) {
                System.out.println("For roll number " + rs.getInt("ROLLNO"));
                System.out.println("Name: " + rs.getString("STUDNAME"));
                System.out.println("Department: " + rs.getString("DEPT"));
                System.out.println("City: " + rs.getString("CITY"));
            } else {
                System.out.println("No student found with roll number 102");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
