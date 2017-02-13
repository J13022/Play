package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Exam_report_schedule extends Model {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int term_code;

	String term;

	@Column(columnDefinition = "datetime")
	Date task_deadline_day;

	@Column(columnDefinition = "datetime")
	Date exam_day;

	@Column(columnDefinition = "datetime")
	Date exam_request_start_day;

	@Column(columnDefinition = "datetime")
	Date exam_request_end_day;
}
