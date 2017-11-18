package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JogadorTimeDAO;
import com.genericrest.model.JogadorTime;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class JogadorTimeDAOImpl extends GenericDAO<JogadorTime, Long> implements JogadorTimeDAO{

    private static final Logger log = LoggerFactory.getLogger(JogadorDAOImpl.class);
    
    public JogadorTimeDAOImpl() {
        super(JogadorTime.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
