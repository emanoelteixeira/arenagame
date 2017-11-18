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
@Table(name = "regrasjogo")
@XmlRootElement(name = "regrasjogo")
public class RegrasJogo extends AbstractEntity {

    @Column(nullable = false)
    private Integer codigoRegra;

    @Column(length = 255, nullable = false)
    private String obsRegras;

    @ManyToOne
    private Jogos jogos;

    public RegrasJogo() {

    }

    public RegrasJogo(Integer codigoRegra, String obsRegras, Jogos jogos) {
        this.codigoRegra = codigoRegra;
        this.obsRegras = obsRegras;
        this.jogos = jogos;
    }

    public Integer getCodigoRegra() {
        return codigoRegra;
    }

    public void setCodigoRegra(Integer codigoRegra) {
        this.codigoRegra = codigoRegra;
    }

    public String getObsRegras() {
        return obsRegras;
    }

    public void setObsRegras(String obsRegras) {
        this.obsRegras = obsRegras;
    }

    public Jogos getJogos() {
        return jogos;
    }

    public void setJogos(Jogos jogos) {
        this.jogos = jogos;
    }

    @Override
    public void updateParameters(Object entity) {
        RegrasJogo other = (RegrasJogo) entity;
        this.codigoRegra = other.codigoRegra;
        this.obsRegras = other.obsRegras;
        this.jogos = other.jogos;
    }

}
