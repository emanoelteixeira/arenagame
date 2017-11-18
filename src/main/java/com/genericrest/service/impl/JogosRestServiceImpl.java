package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.JogosDAO;
import com.genericrest.model.Jogos;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.JogosRestService;
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
@Path("/jogos")
public class JogosRestServiceImpl extends GenericCRUDRestService<Jogos> implements JogosRestService {

    private static final Logger log = LoggerFactory.getLogger(JogosRestServiceImpl.class);
    
    @Inject
    private JogosDAO jogosDAO;
    
    public JogosRestServiceImpl() {
        super(Jogos.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Jogos> list) {
        return new GenericEntity<List<Jogos>>(list) {
        };
    }

    @Override
    public DAO getDao() {
      return jogosDAO;
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
