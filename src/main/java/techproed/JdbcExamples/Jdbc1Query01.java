package techproed.JdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

        Statement st = con.createStatement();

        ResultSet isim = st.executeQuery("SELECT personel_isim , maas FROM personel WHERE personel_id=7369");

        while (isim.next()) {


            System.out.println("Personel adı : " + isim.getString("personel_isim") + "\nPersonel maas :" + isim.getInt("maas"));
        }

        isim.close();

        con.close();

        st.close();


    }

}
