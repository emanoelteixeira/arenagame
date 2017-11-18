
package com.genericrest.dao;

import com.genericrest.dao.impl.OrganizacaoDAOImpl;
import com.genericrest.model.Organizacao;
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
@AdditionalClasses(OrganizacaoDAOImpl.class)
public class OrganizacaoTest {
    
    @Inject
    private OrganizacaoDAO organizacaoDAO;
   
    @Test
    public void testeInjecao(){
        assertNotNull(organizacaoDAO);
    }
    
     @Test
     public void insercao(){
         List<Organizacao> orgs = organizacaoDAO.findAll();
         
         if( orgs == null || orgs.isEmpty()){
             Organizacao organizacao = new Organizacao(1, "teste", new Date());
             organizacaoDAO.save(organizacao);
         }
     
         orgs = organizacaoDAO.findAll();
         
         assertNotNull(orgs);
         assertFalse(orgs.isEmpty());
         
     }
}
