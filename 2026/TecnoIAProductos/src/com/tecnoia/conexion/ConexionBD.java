package com.tecnoia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/tecnoia";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException error) {
            System.out.println("Error de conexion: " + error.getMessage());
        }

        return conexion;
    }
}
