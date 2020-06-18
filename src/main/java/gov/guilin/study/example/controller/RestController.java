/**
 * <p>Title: RestartController.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月7日  
 */
package gov.guilin.study.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gov.guilin.study.example.dao.CityMapper;
import gov.guilin.study.example.model.City;

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
@ResponseBody
public class RestController {

	@Autowired
	private CityMapper cityMapper;

	@RequestMapping(value = "/data")
	public List<City> data() {
		return cityMapper.findAll();
	}
	
	@RequestMapping(value = "/data/{id}")
	public City data2(@PathVariable String id) {
		return cityMapper.findByState(id);
	}
}
