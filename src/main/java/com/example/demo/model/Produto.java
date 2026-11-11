package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto {
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
    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public Boolean getEstoque() {
        return estoque;
    }
    public void setEstoque(Boolean estoque) {
        this.estoque = estoque;
    }
    public Produto() {
    }
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
   
private String nome;
private BigDecimal preco;
private Boolean estoque;
}
