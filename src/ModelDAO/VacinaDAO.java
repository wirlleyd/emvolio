/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import DataBase.DataBase;
import Model.Agente;
import Model.Vacina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VacinaDAO {
    
    public void insert(Vacina v) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("INSERT INTO VACINA(nome, quantidade, observacoes) VALUES (?, ?, ?)");
        stmt.setString(1, v.getNome());
        stmt.setInt(2, v.getQuantidade());
        stmt.setString(3, v.getObservacoes());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void update(Vacina v) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("UPDATE VACINA SET nome = ?, quantidade = ?, observacoes = ?  WHERE id_vacina = ? ");
        stmt.setString(1, v.getNome());
        stmt.setInt(2, v.getQuantidade());
        stmt.setString(3, v.getObservacoes());
        stmt.setInt(4, v.getId_vacina());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void delete(Vacina v) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("DELETE FROM Vacina WHERE id_vacina = ? ");
        stmt.setInt(1, v.getId_vacina());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public Vacina getOne(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vacina v = new Vacina();

        stmt = conn.prepareStatement("SELECT * FROM Vacina WHERE id_vacina = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            v.setId_vacina(rs.getInt("id_vacina"));
            v.setNome(rs.getString("nome"));
            v.setQuantidade(rs.getInt("quantidade"));
            v.setObservacoes(rs.getString("observacoes"));
        }
        DataBase.closeConnection(conn, stmt, rs);
        return v;
    }

    public ArrayList<Vacina> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> vacinas = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Vacina");
        rs = stmt.executeQuery();
        while (rs.next()) {
            Vacina v = new Vacina();
            v.setId_vacina(rs.getInt("id_vacina"));
            v.setNome(rs.getString("nome"));
            v.setQuantidade(rs.getInt("quantidade"));
            v.setObservacoes(rs.getString("observacoes"));
            vacinas.add(v);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return vacinas;
    }
    
    public ArrayList<Vacina> getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> vacinas = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Vacina WHERE id_vacina = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            Vacina v = new Vacina();
            v.setId_vacina(rs.getInt("id_vacina"));
            v.setNome(rs.getString("nome"));
            v.setQuantidade(rs.getInt("quantidade"));
            v.setObservacoes(rs.getString("observacoes"));
            vacinas.add(v);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return vacinas;
    }
    
}
