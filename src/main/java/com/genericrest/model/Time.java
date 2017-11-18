package com.genericrest.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 *
 */
@Entity
@Table(name = "time")
@XmlRootElement(name = "time")
public class Time extends AbstractEntity {

    @Column(nullable = false)
    private Integer codigoTime;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFundacao;

    @ManyToOne
    private Organizacao organizacao;

    @OneToMany(mappedBy = "time")
    private List<JogadorTime> jogadores;

    public Time() {

    }

    public Time(Integer codigoTime, String nome, Date dataFundacao, Organizacao organizacao) {
        this.codigoTime = codigoTime;
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.organizacao = organizacao;
    }
    
   

    public Integer getCodigoTime() {
        return codigoTime;
    }

    public void setCodigoTime(Integer codigoTime) {
        this.codigoTime = codigoTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public List<JogadorTime> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<JogadorTime> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public void updateParameters(Object entity) {
        Time other = (Time) entity;
        this.codigoTime = other.codigoTime;
        this.dataFundacao = other.dataFundacao;
        this.jogadores = other.jogadores;
        this.nome = other.nome;
        this.organizacao = organizacao;
    }

}
