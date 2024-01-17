import java.sql.*;
import java.util.*;
public class Update {
    public static void main(String[] args) {
        String status = "Nada aconteceu ainda.";
    Scanner scnLogin = new Scanner(System.in);
    Scanner scnSenha = new Scanner(System.in);
 try {
    System.out.println("Bem vindo a alteração de senha.");
    System.out.println("Digite Seu login: ");
    String strLogin = scnLogin.nextLine();
 System.out.println("Digite a senha que será alterada: ");
 String strSenha = scnSenha.nextLine();
 System.out.println("Digite a nova senha : ");
 String strNSenha = scnSenha.nextLine();
 String strInsertMySQL = "UPDATE `mysql_connector`.`tbl_login` SET `senha` = '" + strNSenha + "' WHERE (`login` = '" + strLogin + "')";
 Connection conn = App.conectar();
 Statement stmSql = conn.createStatement();
 stmSql.addBatch(strInsertMySQL);
 stmSql.executeBatch();
 stmSql.close();
 status = "Ok!  Sua senha foi alterada com sucesso.";
    }catch (Exception e) {
        System.err.println("Ops! Ocorreu o erro " + e);
}
scnSenha.close();
System.out.println(status);
}
}
