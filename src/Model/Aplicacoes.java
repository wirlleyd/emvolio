/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Aplicacoes {
    private int id_agente;
    private int id_paciente;
    private int id_vacina;
    private String data_aplicacao;
    private String observacoes;
    private String nomeVacina;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Aplicacoes() {
    }

    public Aplicacoes(int id_vacina, int id_agente, int id_paciente, String nomeVacina, String data_aplicacao, String observacoes) {
        this.id_agente = id_agente;
        this.id_paciente = id_paciente;
        this.id_vacina = id_vacina;
        this.data_aplicacao = data_aplicacao;
        this.observacoes = observacoes;
        this.nomeVacina = nomeVacina;
    }

    public int getId_agente() {
        return id_agente;
    }

    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_vacina() {
        return id_vacina;
    }

    public void setId_vacina(int id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}
