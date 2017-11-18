package com.genericrest.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "jogadorTime")
@XmlRootElement(name = "jogadortime")
public class JogadorTime extends AbstractEntity  {

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaida;
    
    @ManyToOne
    private Jogador jogador;
    
    @ManyToOne
    private Time time;
    
    public JogadorTime (){
    
    }

    public JogadorTime(Date dataEntrada, Date dataSaida, Jogador jogador, Time time) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.jogador = jogador;
        this.time = time;
    }
    
    
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    @XmlTransient
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    @XmlTransient
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
     
    @Override
    public void updateParameters(Object entity) {
       JogadorTime other = (JogadorTime) entity;    
       this.dataEntrada  = other.dataEntrada;
       this.dataSaida    = other.dataSaida;
       this.jogador      = other.jogador;
       this.time         = other.time;
    }

  
    
}
