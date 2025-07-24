/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.nextchapter.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import dev.nextchapter.api.dto.WorksDTO;
import dev.nextchapter.api.services.WorksService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/works")
public class WorksController {

    @Autowired
    private WorksService workService;

    @GetMapping("/search")
    public List<WorksDTO> searchWorksByTitle(@RequestParam String title) {
        return workService.findByTitle(title);
    }
}