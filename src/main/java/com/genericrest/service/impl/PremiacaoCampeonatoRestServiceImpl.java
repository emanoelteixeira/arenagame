package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.PremiacaoCampeonatoDAO;
import com.genericrest.model.PremiacaoCampeonato;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.PremiacaoCampeonatoRestService;
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
@Path("/premiacaocampeonato")
public class PremiacaoCampeonatoRestServiceImpl extends GenericCRUDRestService<PremiacaoCampeonato> implements PremiacaoCampeonatoRestService {

    private static final Logger log = LoggerFactory.getLogger(PremiacaoCampeonatoRestServiceImpl.class);
    
    public PremiacaoCampeonatoRestServiceImpl() {
        super(PremiacaoCampeonato.class);
    }

    @Inject
    private PremiacaoCampeonatoDAO premiacaoCampeonatoDAO;
    
    @Override
    public GenericEntity listToGenericEntity(List<PremiacaoCampeonato> list) {
      return new GenericEntity<List<PremiacaoCampeonato>>(list){};
    }

    @Override
    public DAO getDao() {
      return premiacaoCampeonatoDAO;
    }

    @Override
    public Logger getLogger() {
      return log;
    }
    
}
