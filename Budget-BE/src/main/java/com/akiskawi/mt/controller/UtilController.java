package com.akiskawi.mt.controller;

import com.akiskawi.mt.service.UtilsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/db/")
public class UtilController {

    private final UtilsService utilsService;

    @GetMapping("init")
    public String init() {
        utilsService.initMongoDb();
        return "Mongo Database Initiated";
    }

    @DeleteMapping("erase")
    public String eraseDb() {
        utilsService.clearMongoDb();
        return "Mongo Database Erased!";
    }


}
