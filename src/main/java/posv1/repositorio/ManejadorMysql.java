package posv1.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManejadorMysql {
	private final String host;
    private final int puerto;
    private final String baseDatos;
    private final String usuario;
    private final String password;

    public ManejadorMysql(
            String host,
            int puerto,
            String baseDatos,
            String usuario,
            String password) {

        this.host = host;
        this.puerto = puerto;
        this.baseDatos = baseDatos;
        this.usuario = usuario;
        this.password = password;
    }
    
    public Connection conectar() throws SQLException {

        String url =
            String.format(
                "jdbc:mysql://%s:%d/%s?serverTimezone=UTC",
                host,
                puerto,
                baseDatos
            );

        return DriverManager.getConnection(
                url,
                usuario,
                password
        );
    }
    
    public void desconectar(Connection connection)
            throws SQLException {

        if (connection != null &&
            !connection.isClosed()) {

            connection.close();
        }
    }

}
