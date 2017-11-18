package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.JogadorDAO;
import com.genericrest.model.Jogador;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.JogadorRestService;
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
@Path("/jogador")
public class JogadorRestServiceImpl extends GenericCRUDRestService<Jogador> implements JogadorRestService{

    private static final Logger log = LoggerFactory.getLogger(JogadorRestServiceImpl.class);
    
    @Inject
    private JogadorDAO jogadorDAO;
    
    public JogadorRestServiceImpl() {
        super(Jogador.class);
    }    

    @Override
    public GenericEntity listToGenericEntity(List<Jogador> list) {
      return new GenericEntity<List<Jogador>>(list){};
    }

    @Override
    public DAO getDao() {
      return jogadorDAO;
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
