package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.TimesCampeonatoDAO;
import com.genericrest.model.TimesCampeonato;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.TimesCampeonatoRestService;
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
@Path("/timescampeonato")
public class TimesCampeonatoRestServiceImpl extends GenericCRUDRestService<TimesCampeonato> implements TimesCampeonatoRestService {

    private static final Logger log = LoggerFactory.getLogger(TimesCampeonatoRestServiceImpl.class);

    @Inject
    private TimesCampeonatoDAO timesCampeonatoDAO;

    public TimesCampeonatoRestServiceImpl() {
        super(TimesCampeonato.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<TimesCampeonato> list) {
        return new GenericEntity<List<TimesCampeonato>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return timesCampeonatoDAO;
    }

    @Override
    public Logger getLogger() {
        return log;
    }

}
