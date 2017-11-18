package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.PremiacaoCampeonatoDAO;
import com.genericrest.model.PremiacaoCampeonato;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class PremiacaoCampeonatoDAOImpl extends GenericDAO<PremiacaoCampeonato, Long> implements PremiacaoCampeonatoDAO{

    private static final Logger log = LoggerFactory.getLogger(PremiacaoCampeonatoDAOImpl.class);
    
    public PremiacaoCampeonatoDAOImpl() {
        super(PremiacaoCampeonato.class);
    }

    @Override
    public Logger getLogger() {
       return log;
    }
    
}
