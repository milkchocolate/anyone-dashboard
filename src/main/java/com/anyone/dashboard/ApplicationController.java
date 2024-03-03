package com.anyone.dashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @GetMapping("/applications")
    public List<String> getApplications() {
        return List.of(
                "Application 1",
                "Application 2",
                "Application 3 论坛 - https://anyone-dashboard.discourse.group/"
        );
    }
}
