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
@Table(name = "organizacao")
@XmlRootElement(name = "organizacao")
public class Organizacao extends AbstractEntity {
    
    
    @Column(nullable = false)
    private Integer CodigoOrganizacao ;

    @Column(length = 255, nullable = false)
    private String NomeOrganizacao;
               
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataFundacao;
    
   
    public Organizacao() {
    }

    public Organizacao(Integer CodigoOrganizacao, String NomeOrganizacao, Date dataFundacao) {
        this.CodigoOrganizacao = CodigoOrganizacao;
        this.DataFundacao = dataFundacao;
        this.NomeOrganizacao = NomeOrganizacao;
    }

    public Integer getCodigoOrganizacao() {
        return CodigoOrganizacao;
    }

    public void setCodigoOrganizacao(Integer CodigoOrganizacao) {
        this.CodigoOrganizacao = CodigoOrganizacao;
    }

    public String getNomeOrganizacao() {
        return NomeOrganizacao;
    }

    public void setNomeOrganizacao(String NomeOrganizacao) {
        this.NomeOrganizacao = NomeOrganizacao;
    }

    public Date getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Date DataFundacao) {
        this.DataFundacao = DataFundacao;
    }
    
    
    @Override
    public void updateParameters(Object entity) {
        Organizacao other = (Organizacao) entity;
        this.CodigoOrganizacao = other.CodigoOrganizacao;
        this.NomeOrganizacao = other.NomeOrganizacao;
        this.DataFundacao = other.DataFundacao;
    }
        
    
}
