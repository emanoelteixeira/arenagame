
package com.genericrest.dao;

import com.genericrest.dao.impl.JogadorDAOImpl;
import com.genericrest.model.Jogador;
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
@AdditionalClasses(JogadorDAOImpl.class)
public class JogadorTest {
    
      
    @Inject
    private JogadorDAO jogadorDAO;
   
    @Test
    public void testeInjecao(){
        assertNotNull(jogadorDAO);
    }
    
     @Test
     public void insercao(){
         List<Jogador> jogadores = jogadorDAO.findAll();
         
         if( jogadores == null || jogadores.isEmpty()){
             
             Jogador jogador = new Jogador(1, "teste", new Date(), "05555555500");
             jogadorDAO.save(jogador);
         }
     
         jogadores = jogadorDAO.findAll();
         
         assertNotNull(jogadores);
         assertFalse(jogadores.isEmpty());
         
     }
}
