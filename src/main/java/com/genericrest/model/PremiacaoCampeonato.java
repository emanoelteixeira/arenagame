package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "premiacaocampeonato")
@XmlRootElement(name = "premiacaocampeonato")
public class PremiacaoCampeonato extends AbstractEntity {

    @Column(nullable = false)
    private Integer Codigo;

    @Column(length = 255, nullable = false)
    private String obs;

    @Column(nullable = false)
    private double valorPremiacao;

    @ManyToOne
    private Campeonato campeonato;

    public PremiacaoCampeonato() {
    }

    public PremiacaoCampeonato(Integer Codigo, String obs, double valorPremiacao, Campeonato campeonato) {
        this.Codigo = Codigo;
        this.obs = obs;
        this.valorPremiacao = valorPremiacao;
        this.campeonato = campeonato;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getValorPremiacao() {
        return valorPremiacao;
    }

    public void setValorPremiacao(double valorPremiacao) {
        this.valorPremiacao = valorPremiacao;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    @Override
    public void updateParameters(Object entity) {
        PremiacaoCampeonato other = (PremiacaoCampeonato) entity;
        this.Codigo = other.Codigo;
        this.obs = other.obs;
        this.valorPremiacao = other.valorPremiacao;
        this.campeonato = other.campeonato;
    }

}
