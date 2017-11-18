package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.JogadorTimeDAO;
import com.genericrest.model.JogadorTime;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.service.JogadorTimeRestService;

/**
 *
 * @author lucas
 */
@ManagedBean
@Path("/jogadortime")
public class JogadorTimeRestServiceImpl extends GenericCRUDRestService<JogadorTime> implements JogadorTimeRestService {

    private static final Logger log = LoggerFactory.getLogger(JogadorTimeRestServiceImpl.class);
    
    @Inject
    private JogadorTimeDAO jogadorTimeDAO;
    
    
    public JogadorTimeRestServiceImpl() {
        super(JogadorTime.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<JogadorTime> list) {
       return new GenericEntity<List<JogadorTime>>(list){};
    }

    @Override
    public DAO getDao() {
       return jogadorTimeDAO;
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
