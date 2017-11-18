package com.genericrest.dao;

import com.genericrest.dao.impl.CampeonatoDAOImpl;
import com.genericrest.dao.impl.PremiacaoCampeonatoDAOImpl;
import com.genericrest.model.Campeonato;
import com.genericrest.model.Jogos;
import com.genericrest.model.PremiacaoCampeonato;
import java.util.Date;
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
@AdditionalClasses({PremiacaoCampeonatoDAOImpl.class,CampeonatoDAOImpl.class})
public class PremiacaoCampeonatoTest {
    
    @Inject
    private PremiacaoCampeonatoDAO premiacaoCampeonatoDAO;
    
    @Inject
    private CampeonatoDAO campeonatoDAO;
    
    
    @Test
    public void testeInjecao() {
        assertNotNull(premiacaoCampeonatoDAO);
        assertNotNull(campeonatoDAO);
    }
    
    @Test
    public void insercao() {
        List<PremiacaoCampeonato> premiacoes = premiacaoCampeonatoDAO.findAll();
        List<Campeonato> campeonato = campeonatoDAO.findAll();     


        if (premiacoes == null || premiacoes.isEmpty()) {

            PremiacaoCampeonato premis = new PremiacaoCampeonato(1, "premiacao", 500, campeonato.get(0));
            premiacaoCampeonatoDAO.save(premis);

            premiacoes = premiacaoCampeonatoDAO.findAll();
            assertNotNull(premiacoes);
            assertFalse(premiacoes.isEmpty());
        }
    }

    
  
}
