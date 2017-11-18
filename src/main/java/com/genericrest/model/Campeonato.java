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
 */
@Entity
@Table(name = "campeonato")
@XmlRootElement(name = "campeonato")
public class Campeonato extends AbstractEntity {

    @Column(nullable = false)
    private Integer codigoCampeonato;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicial;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinal;

    @Column(nullable = false)
    private double valorTotalPremiacao;
    
    @OneToMany(mappedBy = "campeonato")
    private List<TimesCampeonato> timescampeonato;

    @ManyToOne
    private Jogos jogo;

    public Campeonato() {
    }

    public Campeonato(Integer codigoCampeonato, String nome, Date dataInicial, Date dataFinal, double valorTotalPremiacao, Jogos jogo) {
        this.codigoCampeonato = codigoCampeonato;
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valorTotalPremiacao = valorTotalPremiacao;
        this.jogo = jogo;
    }

    public Integer getCodigoCampeonato() {
        return codigoCampeonato;
    }

    public void setCodigoCampeonato(Integer codigoCampeonato) {
        this.codigoCampeonato = codigoCampeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }
    
    public List<TimesCampeonato> getTimescampeonato() {
        return timescampeonato;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getValorTotalPremiacao() {
        return valorTotalPremiacao;
    }

    public void setValorTotalPremiacao(double valorTotalPremiacao) {
        this.valorTotalPremiacao = valorTotalPremiacao;
    }

    public Jogos getJogo() {
        return jogo;
    }

    public void setJogo(Jogos jogo) {
        this.jogo = jogo;
    }

    public void setTimescampeonato(List<TimesCampeonato> timescampeonato) {
        this.timescampeonato = timescampeonato;
    }
    
    
    

    @Override
    public void updateParameters(Object entity) {
        Campeonato other = (Campeonato) entity;
        this.codigoCampeonato = other.codigoCampeonato;
        this.nome = other.nome;
        this.dataInicial = other.dataInicial;
        this.dataFinal = other.dataFinal;
        this.jogo = other.jogo;
        this.valorTotalPremiacao = other.valorTotalPremiacao;
    }

}
