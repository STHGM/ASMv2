package Interfaces;




import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Tiago
 */
public class MyConnection {
    private Connection connection = null;
    
    public Connection conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/asm", "root", "1r2m3g");
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso", "Confirmação de Conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão com o BD", "Confirmação de Conexão", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
}
