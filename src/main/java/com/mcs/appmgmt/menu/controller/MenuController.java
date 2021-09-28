package com.mcs.appmgmt.menu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appmgmt/menu")
public class MenuController {

    @GetMapping("/main")
    public ResponseEntity getMain() {
        return new ResponseEntity("success", HttpStatus.OK);
    }
}
