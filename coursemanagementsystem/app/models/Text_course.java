package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Text_course extends Model {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int text_course_id;

	String student_id;

	String subject_id;

	String report_a_result;

	String report_b_result;

	String exam_result;

	String evalution;
}
