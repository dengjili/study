/**
 * <p>Title: RestartController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月7日  
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

/**
 * <p>
 * Title: RestartController.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author dengjili
 * @date 2020年6月7日
 */
@Controller
public class TestController {

	@Autowired
	private QuestionMapper questionMapper;

	@RequestMapping(value = "/test/list")
	public String list(Model model) {
		List<Question> questionList = questionMapper.findAll();
		model.addAttribute("questions", questionList);
		return "views/test/list.html";
	}
	
	@RequestMapping(value = "/test/addUI")
	public String addUI(Model model) {
		model.addAttribute("test", new Question());
		return "views/test/add.html";
	}
	
    @RequestMapping(value = {"/test/add" }, method = RequestMethod.POST)
	public String add(@ModelAttribute Question question) {
    	// 随机ID
    	int id = new Random().nextInt(Integer.MAX_VALUE);
    	question.setId(id);
    	questionMapper.insert(question);
    	return "redirect:/test/list";
	}
    
    @RequestMapping(value = {"/test/delete" })
	public String delete(@RequestParam("id") String id) {
    	questionMapper.deleteById(id);
    	return "redirect:/test/list";
	}

	@RequestMapping(value = "/test/updateUI")
	public String updateUI(Model model, @RequestParam("id") String id) {
		Question test = questionMapper.findById(id);
		model.addAttribute("test", test);
		return "views/test/update.html";
	}
	
    @RequestMapping(value = {"/test/update" }, method = RequestMethod.POST)
	public String update(@ModelAttribute Question question) {
    	questionMapper.updateById(question);
    	return "redirect:/test/list";
	}
    
	@RequestMapping(value = "/test/detail")
	public String detail(Model model, @RequestParam("id") String id) {
		// 调整到详情页面
		return "views/test/detail.html";
	}
}
