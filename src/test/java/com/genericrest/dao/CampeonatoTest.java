package com.genericrest.dao;

import com.genericrest.dao.impl.CampeonatoDAOImpl;
import com.genericrest.dao.impl.JogosDAOImpl;
import com.genericrest.model.Campeonato;
import com.genericrest.model.Jogos;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author lucas
 */
@RunWith(CdiRunner.class)
@AdditionalClasses({CampeonatoDAOImpl.class, JogosDAOImpl.class})
public class CampeonatoTest {

    @Inject
    private CampeonatoDAO campeonatoDAO;

    @Inject
    private JogosDAO jogosDAO;

    @Test
    public void testeInjecao() {
        assertNotNull(campeonatoDAO);
        assertNotNull(jogosDAO);
    }

    @Test
    public void insercao() {
        List<Campeonato> campeonato = campeonatoDAO.findAll();
        List<Jogos> jogs = jogosDAO.findAll();

        if (campeonato == null || campeonato.isEmpty()) {

            Campeonato camp = new Campeonato(1, "Campeonato1", new Date(), new Date(), 500, jogs.get(0));
            campeonatoDAO.save(camp);

            campeonato = campeonatoDAO.findAll();
            assertNotNull(campeonato);
            assertFalse(campeonato.isEmpty());
        }
    }

}
