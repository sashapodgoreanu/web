package com.service;

import com.beans.Immagine;
import com.beans.WebAdmin;
import java.sql.*;

/**
 *
 * @author Podgoreanu Alexandru
 */
public class DBController {

    //jdbc:mysql://localhost:3306/dbname
    private static final String dBurl = "jdbc:mysql://95.110.171.18:3306/dbinstance_835_1";
    private static final String dBuser = "649_835";
    private static final String dBpwd = "p.al5388";
    private static Connection conn;
    private static Statement st;
    private static ResultSet rs;

    public static void registerDB() throws SQLException {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /* connect - Attempts to establish a connection to the given database URL.
     * The <code>DriverManager</code> attempts to select an appropriate driver from
     * the set of registered JDBC drivers.
     */

    private static void connect() throws SQLException {
        try {
            //Richiedo la apertura di connessione al DB
            conn = DriverManager.getConnection(dBurl, dBuser, dBpwd);
            st = conn.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Conected to:" + dBurl);
    }

    private static void disconnect() throws SQLException {
        st.close();
        conn.close();
        /*
         * A ResultSet rs is automaticaly closed when its statement is closed
         */
        //rs.close();
        System.out.println("Disconected from " + dBurl);
    }

    public static void createTables() throws SQLException {
        connect();
        DatabaseMetaData md = conn.getMetaData();
        String createImmagine = "CREATE TABLE IMMAGINE"
                + "("
                + "ID INTEGER PRIMARY KEY AUTO_INCREMENT,"
                + "URL VARCHAR (64) NOT NULL,"
                + "DESCRIZIONE VARCHAR (255),"
                + "NUM_VIS INTEGER,"
                + "DATA_CARICAMENTO DATE NOT NULL"
                + ")";
        String createWebAdmin = "CREATE TABLE WEB_ADMIN"
                + "("
                + "LOGIN VARCHAR (32) PRIMARY KEY,"
                + "NOME VARCHAR (64) NOT NULL,"
                + "PASSWORD VARCHAR (32) NOT NULL,"
                + "LASTLOGIN TIMESTAMP NOT NULL"
                + ")";
        try {

            try {
                st.execute("DROP TABLE IMMAGINE");
                System.out.println("Droped successfuly IMMAGINE");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                st.executeUpdate(createImmagine);
                System.out.println("Tabela IMMAGINE creata");
            }
            try {
                st.execute("DROP TABLE WEB_ADMIN");
                System.out.println("Droped successfuly WEB_ADMIN");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                st.executeUpdate(createWebAdmin);
                System.out.println("Tabela WEB_ADMIN creata");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect();
        }

    }

    public static boolean execute(Immagine img) throws SQLException {
        connect();
        String query = "";
        return false;
    }

    public static boolean execute(String querry) throws SQLException {
        connect();
         System.out.println("Querry");
        int result = 0;
        try {
            result = st.executeUpdate(querry);
            System.out.println("Querry executed: " + querry);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect();
        }
        if (result == 1) {
            return true;
        }
        return false;
    }

    public static boolean verificaUtente(WebAdmin webAdmin) throws SQLException {
        connect();
        boolean result = false;
        String querry = "SELECT * FROM WEB_ADMIN";
        try {
            rs = st.executeQuery(querry);
            while (rs.next()) {
                if (rs.getString("login").equalsIgnoreCase(webAdmin.getLogin()) && rs.getString("password").equals(webAdmin.getPassword())) {
                    webAdmin.setNome(rs.getString("nome"));
                    result = true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnect();
        }
        return result;
    } 
    

}
