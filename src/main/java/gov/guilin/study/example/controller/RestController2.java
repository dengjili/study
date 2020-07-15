/**
 * <p>Title: RestartController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月7日  
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gov.guilin.study.example.dao.QuestionMapper;
import gov.guilin.study.example.model.Question;

@Controller
@ResponseBody
public class RestController2 {

	@Autowired
	private QuestionMapper questionMapper;

	@RequestMapping(value = "/data2")
	public Map<String, Object> data() {
		List<Question> data = questionMapper.findAll();
	     Map<String, Object> result = new HashMap<String, Object>();
	     result.put("code", 0);
	     result.put("data", data);
	        return result;
	
	}
	

	
	@RequestMapping(value = "/data2/{id}")
	public Question data2(@PathVariable String id) {
		return questionMapper.findById(id);
	}		
		

	
	}

