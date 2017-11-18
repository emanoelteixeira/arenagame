package com.genericrest.dao;

import com.genericrest.dao.impl.OrganizacaoDAOImpl;
import com.genericrest.dao.impl.TimeDAOImpl;
import com.genericrest.model.Organizacao;
import com.genericrest.model.Time;
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
@AdditionalClasses({TimeDAOImpl.class,OrganizacaoDAOImpl.class})
public class TimeTest {
    
 
    @Inject
    private TimeDAO timeDAO;
    
    @Inject
    private OrganizacaoDAO organizacaoDAO;
   
    @Test
    public void testeInjecao(){
        assertNotNull(timeDAO);
    }
    
     @Test
     public void insercao(){
         List<Time> times = timeDAO.findAll();
         List<Organizacao> orgs = organizacaoDAO.findAll();
         
         if( times == null || times.isEmpty()){
             Time time = new Time(1, "teste", new Date(), orgs.get(0));
             timeDAO.save(time);
         }
     
         times = timeDAO.findAll();
         
         assertNotNull(times);
         assertFalse(times.isEmpty());
         
     }
}
