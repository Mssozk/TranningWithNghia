package org.java.demo.controller;

import org.java.demo.model.TimeSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.java.demo.service.TimeSheetService;
import java.lang.Exception;

@RestController
@RequestMapping("/timesheet")
public class TimeSheetController {

    @Autowired
    private TimeSheetService timeSheetService;

    @PostMapping(name = "/")
    public void createTimeSheet(@RequestBody TimeSheet timesheet) {
        System.out.println(timesheet);
        timeSheetService.createTimeSheet(timesheet);
    }

//    @PutMapping
//    public String updateTimeSheet(@RequestBody TimeSheet timesheet) {
//        System.out.println(timesheet);
//        timeSheetService.updateTimeSheet(timesheet);
//        return "Timesheet updated";
//    }
//
//    @DeleteMapping
//    public String deleteTimeSheet(@RequestParam int id) {
//        timeSheetService.deleteTimeSheetById(id);
//        return "Timesheet deleted";
//    }
//
//    @GetMapping
//    public TimeSheet findTimeSheet(@RequestParam int id) {
//        TimeSheet value = null;
//        try {
//            value = timeSheetService.findTimeSheetById(id);
//            System.out.println("\nTimesheet found");
//        } catch ( Exception e) {
//            System.out.println("\nInvalid");
//            value = new TimeSheet();
//        }
//        return value;
//    }
}

