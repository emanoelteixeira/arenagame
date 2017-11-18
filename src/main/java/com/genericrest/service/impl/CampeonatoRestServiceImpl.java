package com.genericrest.service.impl;

import com.genericrest.dao.CampeonatoDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Campeonato;
import com.genericrest.service.CampeonatoRestService;
import com.genericrest.service.GenericCRUDRestService;
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
@Path("/campeonato")
public class CampeonatoRestServiceImpl extends GenericCRUDRestService<Campeonato> implements CampeonatoRestService {

    private static final Logger log = LoggerFactory.getLogger(CampeonatoRestServiceImpl.class);

    @Inject
    private CampeonatoDAO campeonatoDAO;

    public CampeonatoRestServiceImpl() {
        super(Campeonato.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Campeonato> list) {
        return new GenericEntity<List<Campeonato>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return campeonatoDAO;
    }

    @Override
    public Logger getLogger() {
        return log;
    }

}
