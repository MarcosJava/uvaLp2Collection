package br.com.mrcsfelipe.collections.teste;

import java.util.logging.Logger;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.mrcsfelipe.collections.controller.SetController;


@RunWith(Arquillian.class)
public class SetControllerTest {

	 @Deployment
	    public static Archive<?> createTestArchive() {
	        return ShrinkWrap.create(WebArchive.class, "test.war")
	            .addClasses(SetController.class)
	            .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	            // Deploy our test datasource
	    }

	    @Inject
	    SetController setController;

	    @Inject
	    Logger log;

//	    @Test
//	    public void testRegister() throws Exception {
//	    	setController.setPalavra("Testando a lista");
//	    	setController.registro();
//	    	setController.setPalavra("Testando a lista de nvo");
//	    	setController.registro();
//	    	
//	    	for(String p : setController.getPalavras()){
//	    		log.info("Palavras da lista");
//	    		log.info(p);
//	    	}
//	    	
//	        
//	    }
}
