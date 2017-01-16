package com.corsojava.hello_thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Inizializzazione templateEngine object
        TemplateEngine templateEngine = new TemplateEngine();
        //StringTemplateResolver stringTemplateResolver = new StringTemplateResolver();        
        //stringTemplateResolver.setTemplateMode(TemplateMode.HTML);  
        FileTemplateResolver templateResolver = new FileTemplateResolver();
        templateResolver.setTemplateMode(TemplateMode.HTML);      
        templateResolver.setSuffix(".html");
        templateEngine.setTemplateResolver(templateResolver);        
        
        
        
        // Elaboriamo un template e vediamo il risultato sotto forma di stringa
        
        // context
        Context context = new Context();
        
        Entity e1 = new Entity("giuseppe", "baudo");        
        e1.setLogged(true);
        context.setVariable("user", e1);
        
        
        String result = templateEngine.process("index", context);
        
        System.out.println(result);
    }
}
