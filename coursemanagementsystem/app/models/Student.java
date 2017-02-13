package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Student extends Model {

	@Id
	@NotNull
	String student_id;

	String student_year;

	String student_name;

	String mail_address;

	String password;

	int goal_units;

	String enrollment;

	public static Finder<String,Student> find = new Finder<String,Student>(Student.class);

	public Student(){

	}
	public Student(String student_id, String student_year, String student_name, String mail_address, String password,
			int goal_units, String enrollment) {
		super();
		this.student_id = student_id;
		this.student_year = student_year;
		this.student_name = student_name;
		this.mail_address = mail_address;
		this.password = password;
		this.goal_units = goal_units;
		this.enrollment = enrollment;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_year() {
		return student_year;
	}
	public void setStudent_year(String student_year) {
		this.student_year = student_year;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getMail_address() {
		return mail_address;
	}
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGoal_units() {
		return goal_units;
	}
	public void setGoal_units(int goal_units) {
		this.goal_units = goal_units;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}


}
