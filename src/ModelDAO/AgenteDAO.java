/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import DataBase.DataBase;
import Model.Agente;
import Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AgenteDAO {
    
    public void insert(Agente a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("INSERT INTO AGENTE(id_paciente) VALUES (?)");
        stmt.setInt(1, a.getId_paciente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void update(Agente a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("UPDATE AGENTE SET id_paciente = ? WHERE id_agente = ? ");
        stmt.setInt(1, a.getId_paciente());
        stmt.setInt(2, a.getId_agente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void delete(Agente a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("DELETE FROM AGENTE WHERE id_agente = ? ");
        stmt.setInt(1, a.getId_agente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public Agente getOne(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Agente a = new Agente();

        stmt = conn.prepareStatement("SELECT * FROM Agente WHERE id_agente = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            a.setId_agente(rs.getInt("id_agente"));
            a.setId_paciente(rs.getInt("id_paciente"));
        }
        DataBase.closeConnection(conn, stmt, rs);
        return a;
    }

    public ArrayList<Agente> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Agente> agentes = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Login");
        rs = stmt.executeQuery();
        while (rs.next()) {
            Agente a = new Agente();
            a.setId_agente(rs.getInt("id_agente"));
            a.setId_paciente(rs.getInt("id_paciente"));
            agentes.add(a);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return agentes;
    }
    
}
