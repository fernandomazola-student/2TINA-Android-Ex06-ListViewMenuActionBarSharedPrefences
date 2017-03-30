package br.com.fiap.exercicios.listview.RM77282;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizza implements Serializable {

    private String nome;
    private double valor;
    private int imagempequena;
    private int imagemgrande;
    private String ingredientes;
    private int pontuacao;

    public Pizza(String nome, double valor, int imagempequena, int imagemgrande, String ingredientes, int pontuacao) {
        this.nome = nome;
        this.valor = valor;
        this.imagempequena = imagempequena;
        this.imagemgrande = imagemgrande;
        this.ingredientes = ingredientes;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getImagempequena() {
        return imagempequena;
    }

    public void setImagempequena(int imagempequena) {
        this.imagempequena = imagempequena;
    }

    public int getImagemgrande() {
        return imagemgrande;
    }

    public void setImagemgrande(int imagemgrande) {
        this.imagemgrande = imagemgrande;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
