package org.java.demo.service;

import org.java.demo.model.Project;
import org.java.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void createProject(Project project) {
        projectRepository.save(project);
    }

    public  void updateProject(Project project) { projectRepository.save(project);}

    @Transactional
    public void deleteProjectById(int id) {
        projectRepository.deleteById(id);
    }

    public Project findProjectById(int id) {
        return projectRepository.findById(id);
    }
}
