package techproed.JdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2Query02 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

        Statement st = con.createStatement();

        ResultSet tablo1 = st.executeQuery("SELECT * FROM bolumler");

        while (tablo1.next()) {

            System.out.println(tablo1.getInt(1) + "\t" + tablo1.getString(2) + "\t" + tablo1.getString(3));

        }

    }

}
