package com.example.demo.controller;

import com.example.demo.service.MateriaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/materiais")
public class MateriaisController {
    private MateriaisService materiaisService;

    @Autowired
    public MateriaisController(MateriaisService materiaisService) {
        this.materiaisService = materiaisService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "get", produces = "application/json")
    @ResponseBody
    public String[] get() throws Exception {
        return materiaisService.getMateriais();
    }
}
