/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import DataBase.DataBase;
import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO {

    public void insert(Paciente p) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("INSERT INTO PACIENTE(nome, cidade, rua, complemento, data_nascimento, cpf) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getCidade());
        stmt.setString(3, p.getRua());
        stmt.setString(4, p.getComplemento());
        stmt.setString(5, p.getData_nasc());
        stmt.setString(6, p.getCpf());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void update(Paciente p) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("UPDATE PACIENTE SET nome = ?, cidade = ?, rua = ?, complemento = ?, data_nascimento = ?, cpf = ? WHERE id_paciente = ? ");
        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getCidade());
        stmt.setString(3, p.getRua());
        stmt.setString(4, p.getComplemento());
        stmt.setString(5, p.getData_nasc());
        stmt.setString(6, p.getCpf());
        stmt.setInt(7, p.getId_paciente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public void delete(Paciente p) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;

        stmt = conn.prepareStatement("DELETE FROM PACIENTE WHERE id_paciente = ? ");
        stmt.setInt(1, p.getId_paciente());
        stmt.executeUpdate();
        DataBase.closeConnection(conn, stmt);
    }

    public Paciente getOne(int id) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Paciente p = new Paciente();

        stmt = conn.prepareStatement("SELECT * FROM PACIENTE WHERE id_paciente = ?");
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            p.setId_paciente(rs.getInt("id_paciente"));
            p.setNome(rs.getString("nome"));
            p.setCidade(rs.getString("cidade"));
            p.setRua(rs.getString("rua"));
            p.setComplemento(rs.getString("complemento"));
            p.setData_nasc(rs.getString("data_nascimento"));
            p.setCpf(rs.getString("cpf"));
        }
        DataBase.closeConnection(conn, stmt, rs);
        return p;
    }
    
    public ArrayList<Paciente> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM PACIENTE");
        rs = stmt.executeQuery();
        while (rs.next()) {
            Paciente p = new Paciente();
            p.setId_paciente(rs.getInt("id_paciente"));
            p.setNome(rs.getString("nome"));
            p.setCidade(rs.getString("cidade"));
            p.setRua(rs.getString("rua"));
            p.setComplemento(rs.getString("complemento"));
            p.setData_nasc(rs.getString("data_nascimento"));
            p.setCpf(rs.getString("cpf"));
            pacientes.add(p);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return pacientes;
    }
    
    public ArrayList<Paciente> getByCpf(int cpf) throws ClassNotFoundException, SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM PACIENTE WHERE cpf = ?");
        stmt.setInt(1, cpf);
        rs = stmt.executeQuery();
        while (rs.next()) {
            Paciente p = new Paciente();
            p.setId_paciente(rs.getInt("id_paciente"));
            p.setNome(rs.getString("nome"));
            p.setCidade(rs.getString("cidade"));
            p.setRua(rs.getString("rua"));
            p.setComplemento(rs.getString("complemento"));
            p.setData_nasc(rs.getString("data_nascimento"));
            p.setCpf(rs.getString("cpf"));
            pacientes.add(p);
        }
        DataBase.closeConnection(conn, stmt, rs);
        return pacientes;
    }

}
