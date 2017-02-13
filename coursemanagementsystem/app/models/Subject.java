package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Subject extends Model {

	@Id
	@NotNull
	String subject_code;

	String time_table_code;

	String subject_name;

	String subject_classification;

	String subject_category;

	String standard_course_school_year;

	int term_code1;

	int term_code2;

	String exam_time_table;

	int unit;

	String subject_level;
}
