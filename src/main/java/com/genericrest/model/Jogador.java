
package com.genericrest.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */

@Entity
@Table(name = "jogador")
@XmlRootElement(name = "jogador")
public class Jogador extends AbstractEntity  {
    
    
    @Column(nullable = false)
    private Integer codigoJogador ;

    @Column(length = 255, nullable = false)
    private String nome;
               
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(length = 15, nullable = false)
    private String cpf;

    public Jogador() {
    }

    public Jogador(Integer codigoJogador, String Nome, Date dataNascimento, String cpf) {
        this.codigoJogador = codigoJogador;
        this.nome = Nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
    
    public Integer getCodigoJogador() {
        return codigoJogador;
    }

    public void setCodigoJogador(Integer codigoJogador) {
        this.codigoJogador = codigoJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getcpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void updateParameters(Object entity) {
        Jogador other = (Jogador) entity;
        this.codigoJogador = other.codigoJogador;
        this.nome = other.nome;
        this.dataNascimento = other.dataNascimento;
        this.cpf = other.cpf;
    }
        
    
}
