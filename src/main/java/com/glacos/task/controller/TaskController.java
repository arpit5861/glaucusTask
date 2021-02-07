package com.glacos.task.controller;

import com.glacos.task.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arpit Aggarwal
 */
@RestController
@RequestMapping("counter")
public class TaskController {
    /**
     * Service class to, provide methods to interact with database and perform buiness logigs
     */
    @Autowired
    private CounterService counterService;


    /**
     * Controller to increment integer data
     * @return return incremented value after operation
     */
    @GetMapping("/task")
    public Long incrementCounter() {
        return counterService.incrementCounter();
    }
}
