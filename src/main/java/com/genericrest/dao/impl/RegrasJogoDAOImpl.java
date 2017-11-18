package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.RegrasJogoDAO;
import com.genericrest.model.RegrasJogo;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */

@ApplicationScoped
public class RegrasJogoDAOImpl extends GenericDAO<RegrasJogo, Long> implements RegrasJogoDAO {

    private static final Logger log = LoggerFactory.getLogger(RegrasJogoDAOImpl.class);
    
    public RegrasJogoDAOImpl() {
        super(RegrasJogo.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
