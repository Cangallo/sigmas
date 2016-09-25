package pe.sigmas.conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apalomino
 */
public final class DBConnection {

    private static DBConnection _dbConnectionSingleton = null;
    private static Connection _conn = null;
    private final boolean _flag = true;

    /**
     * A private Constructor prevents any other class from instantiating.
     */
    private DBConnection() {
        if (_conn == null) {
            openConnection();
            System.out.println("Connected to the database");
        }
    }

    public Connection openConnection() {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306";
            String dbName = "sisaguasaniamiento";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "123";
            Class.forName(driver).newInstance();
            String cadena = "";
            cadena = url + "/" + dbName + "";
            _conn = DriverManager.getConnection(cadena, userName, password);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            _conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error : " + ex.getMessage());
            _conn = null;
        }
        return _conn;
    }

    /**
     * Static 'instance' method
     *
     * @return
     */
    public static DBConnection getInstance() {
        synchronized (DBConnection.class) {
            if (_dbConnectionSingleton == null) {
                _dbConnectionSingleton = new DBConnection();
            }
        }
        /* if (_dbConnectionSingleton == null) {
         _dbConnectionSingleton = new DBConnection();
         }*/
        return _dbConnectionSingleton;
    }

    public boolean getConnectionStatus() {
        return _flag;
    }
}
