package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.OrganizacaoDAO;
import com.genericrest.model.Organizacao;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.OrganizacaoRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ManagedBean
@Path("/organizacao")
public class OrganizacaoRestServiceImpl extends GenericCRUDRestService<Organizacao> implements OrganizacaoRestService{

    private static final Logger log = LoggerFactory.getLogger(OrganizacaoRestServiceImpl.class);
    
    @Inject
    private OrganizacaoDAO organizacaoDAO;
    
    
    public OrganizacaoRestServiceImpl() {
        super(Organizacao.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Organizacao> list) {
      return new GenericEntity<List<Organizacao>>(list){};
    }

    @Override
    public DAO getDao() {
      return organizacaoDAO;
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
