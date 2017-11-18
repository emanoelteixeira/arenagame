package com.genericrest.dao;

import com.genericrest.dao.impl.JogosDAOImpl;
import com.genericrest.model.Jogos;
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
@AdditionalClasses(JogosDAOImpl.class)
public class JogosTest {

    @Inject
    private JogosDAO jogosDAO;

    @Test
    public void testeInjecao() {
        assertNotNull(jogosDAO);
    }

    @Test
    public void insercao() {
       List<Jogos> jogs = jogosDAO.findAll();

        if (jogs == null || jogs.isEmpty()) {
            
            Jogos jogo = new Jogos(1, "CS");
            jogosDAO.save(jogo);
        }

        jogs = jogosDAO.findAll();
        assertNotNull(jogs);
        assertFalse(jogs.isEmpty());

    }
}
