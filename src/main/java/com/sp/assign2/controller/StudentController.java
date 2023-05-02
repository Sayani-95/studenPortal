package com.sp.assign2.controller;

import com.sp.assign2.dao.StudentDao;
import com.sp.assign2.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {
    StudentDao studentDao;

    public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @RequestMapping("addStudent")
    public String create(Model model) {
        model.addAttribute("student", new Student(null, 0, null, 0));
        return "AddStudent";
    }

    @RequestMapping(value="/insertStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student) {
        studentDao.addStudent(student);
        return "redirect:/studentRecord";
    }

    @RequestMapping("/studentRecord")
    public String list(Model model) {
        List<Student> student = studentDao.list();
        model.addAttribute("student", student);
        return "StudentRecord";
    }
    @RequestMapping(value="editStudent/{id}")
    public String update(@PathVariable int id, Model model) {
        Student student = studentDao.getStudent(id);
        model.addAttribute("student", student);
        return "EditStudent";
    }

    @RequestMapping(value="editStudent/updateStudent", method = RequestMethod.POST)
    public String update(@ModelAttribute("student") Student student) {
    	studentDao.update(student);
        return "redirect:/studentRecord";
    }

}
