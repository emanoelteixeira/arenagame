package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.TimeDAO;
import com.genericrest.model.Time;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.TimeRestService;
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
@Path("/time")
public class TimeRestServiceImpl extends GenericCRUDRestService<Time> implements TimeRestService {

    private static final Logger log = LoggerFactory.getLogger(TimeRestServiceImpl.class);

    @Inject
    private TimeDAO timeDAO;

    public TimeRestServiceImpl() {
        super(Time.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Time> list) {
        return new GenericEntity<List<Time>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return timeDAO;
    }

    @Override
    public Logger getLogger() {
        return log;
    }

}
