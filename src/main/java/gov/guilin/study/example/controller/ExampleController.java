/**
 * <p>Title: ExampleController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月2日  
 */
package gov.guilin.study.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * <p>Title: ExampleController.java</p>  
 * <p>Description: </p>  
 * @author    dengjili
 * @date      2020年6月2日  
 */
@RestController
public class ExampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
    @RequestMapping("/hello")
    public String index() {
    	logger.info("receive hello request...");
        return "Hello World";
    }
}
