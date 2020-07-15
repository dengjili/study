/**
 * <p>Title: WebController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月3日  
 */
package gov.guilin.study.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gov.guilin.study.example.dao.QuestionMapper;
import gov.guilin.study.example.model.Question;

@Controller
public class WebController {
	@Autowired
	private QuestionMapper questionMapper;
	
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
   
   @RequestMapping(value = "/table/simple")
   public String simple(Model model) {
	   List<Question> data2 = questionMapper.findAll();
	   model.addAttribute("data2", data2);
	   return "views/home/homepage4.html";
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