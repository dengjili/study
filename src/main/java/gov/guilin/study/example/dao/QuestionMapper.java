package gov.guilin.study.example.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

	@Insert("INSERT INTO QUESTION( id ,  type ,  chapterId ,  question ,  iterns ,  imgurl ,  rightAnswer ,  answerAnalysis ,  extend ) "
			+ "VALUES ( #{id} ,  #{type} ,  #{chapterId} ,  #{question} ,  #{iterns} ,  #{imgurl} ,  #{rightAnswer} ,  #{answerAnalysis} ,  #{extend})")
	void insert(Question question);

	@Select("delete FROM QUESTION WHERE id = #{id}")
	void deleteById(String id);

	@Update("UPDATE QUESTION SET type 	= #{type },  chapterId 	= #{chapterId },  question 	= #{question },  iterns 	= #{iterns },  imgurl 	= #{imgurl },  rightAnswer 	= #{rightAnswer },  answerAnalysis 	= #{answerAnalysis },  extend 	= #{extend }  WHERE id = #{id}")
	void updateById(Question question);
}
