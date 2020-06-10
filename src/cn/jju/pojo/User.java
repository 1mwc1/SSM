package cn.jju.pojo;

public class User {

	private int id;
	private int studentId;
	private int teacherId;
	private int courseId;
	private float score;
	private String memo;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", studentId=" + studentId + ", teacherId="
				+ teacherId + ", courseId=" + courseId + ", score=" + score
				+ ", memo=" + memo + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
