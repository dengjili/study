/**
 * <p>Title: CityMapper.java</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月7日  
 */
package gov.guilin.study.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import gov.guilin.study.example.model.City;

/** 
 * <p>Title: CityMapper.java</p>  
 * <p>Description: </p>  
 * @author    dengjili
 * @date      2020年6月7日  
 */
@Mapper
public interface CityMapper {

  @Select("SELECT * FROM CITY WHERE state = #{state}")
  City findByState(@Param("state") String state);

  @Select("SELECT * FROM CITY")
  List<City> findAll();
} 