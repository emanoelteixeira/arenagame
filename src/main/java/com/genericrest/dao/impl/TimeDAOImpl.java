package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.TimeDAO;
import com.genericrest.model.Time;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class TimeDAOImpl extends GenericDAO<Time, Long> implements TimeDAO{

    private static final Logger log = LoggerFactory.getLogger(TimeDAOImpl.class);
    
    public TimeDAOImpl() {
        super(Time.class);
    }

    @Override
    public Logger getLogger() {
      return log; 
    }

}
