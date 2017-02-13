package controllers;

import java.util.List;

import models.Student;
import play.mvc.Controller;
import play.mvc.Result;


public class StudentListController extends Controller {

	public Result getAllStudent(){
		List<Student> student = Student.find.all();
		return ok(views.html.studentlist.render(student));
	}
}
