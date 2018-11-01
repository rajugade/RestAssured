package com.macys.marketing.msp.LtyIntegrationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author rmarla
 * This Class is for creating Spring {@link ApplicationContext} and make it Singleton
 *
 */
public class LtyApplicationContext {
	
	private static LtyApplicationContext lty = null;
	static{
		lty = new LtyApplicationContext();
		
		if(lty.context == null){
			lty.context = new AnnotationConfigApplicationContext(LtyOfferToolApplicationConfig.class);
		}
	}
	
	private ApplicationContext context = null;
	
	private LtyApplicationContext(){	}
	
	public static LtyApplicationContext getInstance(){
		return lty;
	}
	
	/**
	 * 
	 * @return Spring {@link ApplicationContext} object
	 */
	public ApplicationContext getContext(){
		
		return lty.context;
	}

}
