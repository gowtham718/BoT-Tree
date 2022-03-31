//package mypkg;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//public class Homecontroller {
//	@Autowired
//	private RestTemplate restTemplate;
//	
//		@GetMapping("/home")
//		public String home()
//		{
//			String products=restTemplate.getForObject("http://localhost:8081/product", String.class);
////		    return("Welcome to Homepage");
//			return products;
//	    }
//		
////		@GetMapping("/contact-page")
////		public String contectpage()
////		{
////		    return("contact details : 0123456789");
////	    }
//
//	}
package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Homecontroller {
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/home")
	public String home()
	{
		String product=restTemplate.getForObject("http://PRODUCT-MICROSERVICE/score",String.class);
	    return product;
		//return("Welcome to Homepage");
    }
//	public ModelAndView productpage() {
//		ModelAndView mv=new ModelAndView();
//		String product=restTemplate.getForObject("http://SCORE-MICROSERVICE/score",String.class);
//		mv.addObject("score",score);
//		mv.setViewName("home");
//		return mv;
//		
//	}

}


