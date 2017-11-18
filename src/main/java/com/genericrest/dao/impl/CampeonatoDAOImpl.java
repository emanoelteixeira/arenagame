package com.genericrest.dao.impl;

import com.genericrest.dao.CampeonatoDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Campeonato;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class CampeonatoDAOImpl extends GenericDAO<Campeonato, Long> implements CampeonatoDAO {

    private static final Logger log = LoggerFactory.getLogger(CampeonatoDAOImpl.class);

    public CampeonatoDAOImpl() {
        super(Campeonato.class);
    }

    @Override
    public Logger getLogger() {
        return log;
    }

}
