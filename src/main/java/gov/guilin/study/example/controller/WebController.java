/**
 * <p>Title: WebController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月3日  
 */
package gov.guilin.study.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
   @RequestMapping(value = "/index")
   public String index() {
      return "views/index.html";
   }
   
   @RequestMapping(value = "/home/console")
   public String console() {
      return "views/home/console.html";
   }
   
   @RequestMapping(value = "/home/homepage3")
   public String homepage3() {
      return "views/home/homepage3.html";
   }
   
   @RequestMapping(value = "/show")
   public String show(Model model) {
	  model.addAttribute("uid","123456789");
      model.addAttribute("name","Jerry");
      return "show";
   }
   
   @RequestMapping(value = "/layui")
   public String layui(Model model) {
	  model.addAttribute("uid","123456789");
      model.addAttribute("name","Jerry");
      return "layui";
   }
}