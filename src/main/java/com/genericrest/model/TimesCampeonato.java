package com.genericrest.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "timescampeonato")
@XmlRootElement(name = "timescampeonato")
public class TimesCampeonato extends AbstractEntity{

    @ManyToOne
    private Time time;
    
    @ManyToOne
    private Campeonato campeonato;

    public TimesCampeonato() {
    }

    public TimesCampeonato(Time time, Campeonato campeonato) {
        this.time = time;
        this.campeonato = campeonato;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @XmlTransient
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
      
    @Override
    public void updateParameters(Object entity) {
      TimesCampeonato other = (TimesCampeonato) entity;
      this.campeonato = other.campeonato;
      this.time = other.time; 
    }
    
}
