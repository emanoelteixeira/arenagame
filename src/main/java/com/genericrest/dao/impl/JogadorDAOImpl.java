package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.JogadorDAO;
import com.genericrest.model.Jogador;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lucas
 */
@ApplicationScoped
public class JogadorDAOImpl extends GenericDAO<Jogador, Long> implements JogadorDAO{

    private static final Logger log = LoggerFactory.getLogger(JogadorDAOImpl.class);
    
    public JogadorDAOImpl() {
        super(Jogador.class);
    }

    @Override
    public Logger getLogger() {
      return log;
    }
    
}
