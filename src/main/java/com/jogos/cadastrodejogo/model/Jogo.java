package com.jogos.cadastrodejogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class Jogo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome precisa ter algum nome")
    private String nome;
    @NotBlank(message = "O gênero precia ter algum gênero")
    private String genero;
    @NotBlank(message = "A plataforma precisa ter alguma plataforma")
    private String plataforma;
    @NotNull(message = "O ano de lançamento precisa ter algo ou esta faltando o ano!")
    private Integer anoLancamento;

    public Jogo() {
    }

    public Jogo(String nome, String genero, String plataforma, Integer anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anoLancamento = anoLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
