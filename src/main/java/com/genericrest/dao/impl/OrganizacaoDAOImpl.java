package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.OrganizacaoDAO;
import com.genericrest.model.Organizacao;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class OrganizacaoDAOImpl extends GenericDAO<Organizacao, Long> implements OrganizacaoDAO{

    private static final Logger log = LoggerFactory.getLogger(OrganizacaoDAOImpl.class);
    
    public OrganizacaoDAOImpl() {
        super(Organizacao.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
