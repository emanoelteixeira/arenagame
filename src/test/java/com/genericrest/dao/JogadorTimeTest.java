
package com.genericrest.dao;

import com.genericrest.dao.impl.JogadorDAOImpl;
import com.genericrest.dao.impl.JogadorTimeDAOImpl;
import com.genericrest.dao.impl.TimeDAOImpl;
import com.genericrest.model.Jogador;
import com.genericrest.model.JogadorTime;
import com.genericrest.model.Time;
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
@AdditionalClasses({JogadorTimeDAOImpl.class,TimeDAOImpl.class,JogadorDAOImpl.class})
public class JogadorTimeTest {
    
    
    @Inject
    private JogadorTimeDAO jogadorTimeDAO;
    
    @Inject
    private TimeDAO timeDAO;
    
    @Inject
    private JogadorDAO jogadorDAO;
   
    @Test
    public void testeInjecao(){
        assertNotNull(jogadorTimeDAO);
    }
    
     @Test
     public void insercao(){
         List<JogadorTime> jogatime = jogadorTimeDAO.findAll();
         List<Time> times = timeDAO.findAll();
         List<Jogador> jogador = jogadorDAO.findAll();
         
         if( jogatime == null || jogatime.isEmpty()){
             JogadorTime jogadorTime = new JogadorTime(new Date() , new Date(), jogador.get(0), times.get(0));
             jogadorTimeDAO.save(jogadorTime);
         }
     
         jogatime = jogadorTimeDAO.findAll();
         
         assertNotNull(jogatime);
         assertFalse(jogatime.isEmpty());
         
     }
    
    
}
