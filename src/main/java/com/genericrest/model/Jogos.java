package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "jogos")
@XmlRootElement(name = "jogos")
public class Jogos extends AbstractEntity {

    @Column(nullable = false)
    private Integer codigoJogo;

    @Column(length = 255, nullable = false)
    private String nome;

    public Jogos() {
    }
    
    public Jogos(Integer codigoJogo, String nome) {
        this.codigoJogo = codigoJogo;
        this.nome = nome;
    }

    public Integer getCodigoJogo() {
        return codigoJogo;
    }

    public void setCodigoJogo(Integer codigoJogo) {
        this.codigoJogo = codigoJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void updateParameters(Object entity) {
        Jogos other = (Jogos) entity;
        this.codigoJogo = other.codigoJogo;
        this.nome = other.nome;
    }

}
