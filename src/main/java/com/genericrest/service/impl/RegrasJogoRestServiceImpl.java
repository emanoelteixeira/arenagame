package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.RegrasJogoDAO;
import com.genericrest.model.RegrasJogo;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.RegrasJogoRestService;
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
@Path("/regrasjogo")
public class RegrasJogoRestServiceImpl extends GenericCRUDRestService<RegrasJogo> implements RegrasJogoRestService{

    private static final Logger log = LoggerFactory.getLogger(RegrasJogoRestServiceImpl.class);
    
    @Inject
    private RegrasJogoDAO regrasJogoDAO;
      
    public RegrasJogoRestServiceImpl() {
        super(RegrasJogo.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<RegrasJogo> list) {
       return new GenericEntity<List<RegrasJogo>>(list){};
    }

    @Override
    public DAO getDao() {
       return regrasJogoDAO;
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
