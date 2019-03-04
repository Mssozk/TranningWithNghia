package org.java.demo.service;

import org.java.demo.model.Project;
import org.java.demo.model.TimeSheet;
import org.java.demo.model.TimeSheetID;
import org.java.demo.model.User;
import org.java.demo.repository.ProjectRepository;
import org.java.demo.repository.TimeSheetRepository;
import org.java.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TimeSheetService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TimeSheetRepository timeSheetRepository;

    public void createTimeSheet(TimeSheet timesheet) {
        User user = userRepository.findById(1);
        Project project = projectRepository.findById(1);
        TimeSheetID timeSheetId = new TimeSheetID(user, project);

        timesheet.setTimeSheetID(timeSheetId);
        // over write
//        timesheet.setDate(1L);
//        timesheet.setValue(123123F);

        timeSheetRepository.save(timesheet);
    }
//
//    public TimeSheet findTimeSheetById(int user_id, int id) {
//        return timeSheetRepository.findById(user_id, id);
//
//    }

    public User findUserById(int id) {
        return userRepository.findById(id);
    }
//    public void updateTimeSheet(TimeSheet timesheet) {
//        timeSheetRepository.save(timesheet);
//    }
//
//    @Transactional
//    public void deleteTimeSheetById(int id) {
//        timeSheetRepository.deleteById(id);
//    }
//    public TimeSheet findTimeSheetById(int id) {
////        return timeSheetRepository.findById(id);
//        return null;
//    }



}

