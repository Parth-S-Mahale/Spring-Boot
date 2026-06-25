import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        /* JDBC steps:
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         */

        int sid = 101;
        String sname = "Jasmine";
        int marks = 52;

        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String uname = "postgres";
        String pass = "1972";
        String query1 = "select * from student";
        String query2 = "insert into student values (6, 'Max', 32)";
        String query3 = "update student set sname='Bob' where sid = 5";
        String query4 = "delete from student where sid = 5";
        String query = "insert into student values (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connection Established");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sid);
            pst.setString(2, sname);
            pst.setInt(3, marks);

//            Statement st = con.createStatement();
//            st.execute(query4);

//            ResultSet rs = st.executeQuery(query1);
//            rs.next();
//            String name = rs.getString("sname");
//            System.out.println("Name of a student is : " + name);
//            while(rs.next()) {
//                System.out.print(rs.getInt(1) + " - ");
//                System.out.print(rs.getString(2) + " - ");
//                System.out.println(rs.getInt(3));
//            }

            pst.execute();
            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
