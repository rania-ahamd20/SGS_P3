package com.example.SGS_P3.controller;

import com.example.SGS_P3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String showStatsPage(Model model) {
        List<String> courses = studentService.getAllCourses();

        model.addAttribute("courses", courses);

        return "stats";
    }


}
