package com.gssoa.model;

import jakarta.persistence.*;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int tempoEstimado;

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public int getTempoEstimado() { return tempoEstimado; }
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTempoEstimado(int tempoEstimado) { this.tempoEstimado = tempoEstimado; }
}