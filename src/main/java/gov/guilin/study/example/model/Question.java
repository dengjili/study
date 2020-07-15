package gov.guilin.study.example.model;

/**
 * <p>Title: Question</p>
 * <p>Description: </p>
 * @author    dengjili
 * @date      2020年6月30日 下午10:46:10
 */
public class Question {
	private int id;
	private String type;
	private String chapterId;
	private String question;
	private String iterns;
	private String imgurl;
	private String rightAnswer;
	private String answerAnalysis;
	private String extend;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getChapterId() {
		return chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getIterns() {
		return iterns;
	}
	public void setIterns(String iterns) {
		this.iterns = iterns;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getAnswerAnalysis() {
		return answerAnalysis;
	}
	public void setAnswerAnalysis(String answerAnalysis) {
		this.answerAnalysis = answerAnalysis;
	}
	public String getExtend() {
		return extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}
}
