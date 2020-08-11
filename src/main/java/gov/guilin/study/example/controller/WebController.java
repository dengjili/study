/**
 * <p>Title: WebController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月3日  
 */
package gov.guilin.study.example.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
   
   //展示全部列表页面
   @RequestMapping(value = "/test/list1")
   public String simple(Model model) {
	   List<Question> data2 = questionMapper.findAll();
	   model.addAttribute("data2", data2);
	   return "views/test/list1.html";
   }
   
   //新增页面
   @RequestMapping(value = "/addUI")
   public String form(Model model) {
	   return "views/test/add1.html";
   }
   
   //新增题目提交
   @RequestMapping(value = {"/test/add1" }, method = RequestMethod.POST)
	public String add(@ModelAttribute Question question) {
   	// 随机ID
   	int id = new Random().nextInt(Integer.MAX_VALUE);
   	question.setId(id);
   	questionMapper.insert(question);
   	return "1";
	}
   
   //删除
   @RequestMapping(value = {"/test/delete1"})
	public String delete(@RequestParam("id") String id) {
   	questionMapper.deleteById(id);
   	return "redirect:/test/list1";
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