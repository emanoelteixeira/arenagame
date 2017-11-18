package com.genericrest.dao;

import com.genericrest.dao.impl.JogosDAOImpl;
import com.genericrest.dao.impl.RegrasJogoDAOImpl;
import com.genericrest.model.Jogos;
import com.genericrest.model.RegrasJogo;
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
@AdditionalClasses({RegrasJogoDAOImpl .class,JogosDAOImpl.class})
public class RegrasJogosTest {
    
     @Inject
    private RegrasJogoDAO regrasJogoDAO;
    
    @Inject
    private JogosDAO jogosDAO;
   
    @Test
    public void testeInjecao(){
        assertNotNull(regrasJogoDAO);
    }
    
     @Test
     public void insercao(){
         List<RegrasJogo> regrasjogos = regrasJogoDAO.findAll();
         List<Jogos> jogos = jogosDAO.findAll();
         
         if( regrasjogos == null || regrasjogos.isEmpty()){
             
             RegrasJogo regrasjogo = new RegrasJogo(1, "teste", jogos.get(0));
             regrasJogoDAO.save(regrasjogo);
         }
     
         regrasjogos = regrasJogoDAO.findAll();
         
         assertNotNull(regrasjogos);
         assertFalse(regrasjogos.isEmpty());
         
     }  
}
