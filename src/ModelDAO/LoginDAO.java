/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import DataBase.DataBase;
import Model.Login;
import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO {

    public void insert(Login l) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("INSERT INTO LOGIN(id_agente , senha , id) VALUES (?, ?, ?)");
        stmt.setInt(1, l.getId_agente());
        stmt.setString(2, l.getSenha());
        stmt.setString(3, l.getId());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void update(Login l) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("UPDATE LOGIN SET id_agente = ?, senha = ?, id = ? WHERE id_login = ? ");
        stmt.setInt(1, l.getId_agente());
        stmt.setString(2, l.getSenha());
        stmt.setString(3, l.getId());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void delete(Login l) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("DELETE FROM LOGIN WHERE id_login = ? ");
        stmt.setInt(1, l.getId_login());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public Login getOne(String senha, String id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Login l = new Login();

        stmt = conn.prepareStatement("SELECT * FROM Login WHERE senha = ? AND id  = ?");
        stmt.setString(1, senha);
        stmt.setString(2, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            l.setId_login(rs.getInt("id_login"));
            l.setId_agente(rs.getInt("id_agente"));
            l.setSenha(rs.getString("senha"));
            l.setId(rs.getString("id"));
        }
        DataBase.closeConnection(conn, stmt, rs);
        return l;
    }

    public ArrayList<Login> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Login> logins = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Login");
        rs = stmt.executeQuery();
        while (rs.next()) {
            Login l = new Login();
            l.setId_login(rs.getInt("id_login"));
            l.setId_agente(rs.getInt("id_agente"));
            l.setSenha(rs.getString("senha"));
            l.setId(rs.getString("id"));
            logins.add(l);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return logins;
    }

}
