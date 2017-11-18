package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.TimesCampeonatoDAO;
import com.genericrest.model.TimesCampeonato;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class TimesCampeonatoDAOImpl  extends GenericDAO<TimesCampeonato, Long> implements TimesCampeonatoDAO {

    private static final Logger log = LoggerFactory.getLogger(TimesCampeonatoDAOImpl.class);
    
    public TimesCampeonatoDAOImpl() {
        super(TimesCampeonato.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
