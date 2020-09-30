/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import DataBase.DataBase;
import Model.Aplicacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AplicacoesDAO {
    
    public void insert(Aplicacoes a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("INSERT INTO APLICACOES(id_vacina , id_agente, id_paciente, nomeVacina, data_aplicacao, observacoes) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, a.getId_vacina());
        stmt.setInt(2, a.getId_agente());
        stmt.setInt(3, a.getId_paciente());
        stmt.setString(4, a.getNomeVacina());
        stmt.setString(5, a.getData_aplicacao());
        stmt.setString(6, a.getObservacoes());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void update(Aplicacoes a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("UPDATE APLICACOES SET id_vacina = ?, id_agente = ?, id_paciente = ?, nomeVacina = ?, data_aplicacao = ?, observacoes = ?  WHERE id_paciente = ? ");
        stmt.setInt(1, a.getId_vacina());
        stmt.setInt(2, a.getId_agente());
        stmt.setInt(3, a.getId_paciente());
        stmt.setString(4, a.getNomeVacina());
        stmt.setString(5, a.getData_aplicacao());
        stmt.setString(6, a.getObservacoes());
        stmt.setInt(7, a.getId_paciente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void delete(Aplicacoes a) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("DELETE FROM APLICACOES WHERE id_paciente = ? ");
        stmt.setInt(1, a.getId_paciente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public Aplicacoes getOne(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Aplicacoes a = new Aplicacoes();

        stmt = conn.prepareStatement("SELECT * FROM Aplicacoes WHERE id_paciente = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            a.setId_vacina(rs.getInt("id_vacina"));
            a.setId_agente(rs.getInt("id_agente"));
            a.setId_paciente(rs.getInt("id_paciente"));
            a.setNomeVacina(rs.getString("nomeVacina"));
            a.setData_aplicacao(rs.getString("data_aplicacao"));
            a.setObservacoes(rs.getString("observacoes"));
        }
        DataBase.closeConnection(conn, stmt, rs);
        return a;
    }

    public ArrayList<Aplicacoes> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Aplicacoes> aplicacoes = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Aplicacoes");
        rs = stmt.executeQuery();
        while (rs.next()) {
            Aplicacoes a = new Aplicacoes();
            a.setId_vacina(rs.getInt("id_vacina"));
            a.setId_agente(rs.getInt("id_agente"));
            a.setId_paciente(rs.getInt("id_paciente"));
            a.setNomeVacina(rs.getString("nomeVacina"));
            a.setData_aplicacao(rs.getString("data_aplicacao"));
            a.setObservacoes(rs.getString("observacoes"));
            aplicacoes.add(a);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return aplicacoes;
    }
    
    public ArrayList<Aplicacoes> getAllByPaciente(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Aplicacoes> aplicacoes = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Aplicacoes WHERE id_paciente = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            Aplicacoes a = new Aplicacoes();
            a.setId_vacina(rs.getInt("id_vacina"));
            a.setId_agente(rs.getInt("id_agente"));
            a.setId_paciente(rs.getInt("id_paciente"));
            a.setNomeVacina(rs.getString("nomeVacina"));
            a.setData_aplicacao(rs.getString("data_aplicacao"));
            a.setObservacoes(rs.getString("observacoes"));
            aplicacoes.add(a);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return aplicacoes;
    }
}
