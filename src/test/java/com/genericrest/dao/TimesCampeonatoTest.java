/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.dao.impl.CampeonatoDAOImpl;
import com.genericrest.dao.impl.TimeDAOImpl;
import com.genericrest.dao.impl.TimesCampeonatoDAOImpl;
import com.genericrest.model.Campeonato;
import com.genericrest.model.Time;
import com.genericrest.model.TimesCampeonato;
import java.util.List;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author lucas
 */
@RunWith(CdiRunner.class)
@AdditionalClasses({TimesCampeonatoDAOImpl.class,TimeDAOImpl.class,CampeonatoDAOImpl.class})
public class TimesCampeonatoTest {
    
    @Inject
    private TimesCampeonatoDAO timesCampeonatoDAO;
    
    @Inject
    private TimeDAO timeDAO;
    
    @Inject
    private CampeonatoDAO campeonatoDAO;
    
    @Test
    public void testeInjecao(){
        assertNotNull(timesCampeonatoDAO);
        assertNotNull(timeDAO);
        assertNotNull(campeonatoDAO);
    }
    
    @Test
    public void insercao() {
        List<Campeonato> campeonato = campeonatoDAO.findAll();
        List<Time> times = timeDAO.findAll();
        List<TimesCampeonato> timescampeonato = timesCampeonatoDAO.findAll();

        if (timescampeonato == null || timescampeonato.isEmpty()) {

            TimesCampeonato timesCamp = new TimesCampeonato(times.get(0), campeonato.get(0));
            timesCampeonatoDAO.save(timesCamp);

            timescampeonato = timesCampeonatoDAO.findAll();
            assertNotNull(timescampeonato);
            assertFalse(timescampeonato.isEmpty());
        }
    }
    
}
