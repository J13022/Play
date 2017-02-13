package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class Administrator extends Model {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int administrator_id;

	String password;
}
