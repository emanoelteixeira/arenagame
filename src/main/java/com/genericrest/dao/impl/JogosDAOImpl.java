package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JogosDAO;
import com.genericrest.model.Jogos;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class JogosDAOImpl extends GenericDAO<Jogos, Long> implements JogosDAO{

    private static final Logger log = LoggerFactory.getLogger(JogosDAOImpl.class);
    
    public JogosDAOImpl() {
        super(Jogos.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
