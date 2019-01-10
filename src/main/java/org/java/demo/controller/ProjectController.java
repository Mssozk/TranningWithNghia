package org.java.demo.controller;

import org.java.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.java.demo.service.ProjectService;


import java.util.List;
import java.lang.Exception;

@RestController
@RequestMapping("/project")
public class ProjectController {


    @Autowired
    private ProjectService projectService;


    @PostMapping(name = "/")
    public void createProject(@RequestBody Project project) {
        System.out.println(project);
        projectService.createProject(project);
    }

    @PutMapping
    public String updateProject(@RequestBody Project project) {
        System.out.println(project);
        projectService.updateProject(project);
        return "Project updated";
    }

    @DeleteMapping
    public String deleteProject(@RequestParam int id) {
        projectService.deleteProjectById(id);
        return "Project deleted";
    }

    @GetMapping
    public Project findProject(@RequestParam int id) {
    Project value = null;
    try {
        value = projectService.findProjectById(id);
        System.out.println("\nProject found");
    } catch ( Exception e) {
        System.out.println("\nInvalid ");
        value = new Project();
    }
    return value;
        }
}