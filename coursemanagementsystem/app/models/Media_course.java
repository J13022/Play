package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Media_course extends Model {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int media_course_id;

	String student_id;

	String subject_id;

	int task_submission_time;

	String exam_result;

	String evalution;
}
