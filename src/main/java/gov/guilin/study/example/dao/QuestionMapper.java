package gov.guilin.study.example.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import gov.guilin.study.example.model.Question;

/** 
 * <p>Title: CityMapper.java</p>  
 * <p>Description: </p>  
 * @author    dengjili
 * @date      2020年6月7日  
 */
@Mapper
public interface QuestionMapper {

	  @Select("SELECT * FROM QUESTION WHERE id = #{id}")
	  Question findById(@Param("id") String id);

	  @Select("SELECT * FROM QUESTION")
	  List<Question> findAll();
}
