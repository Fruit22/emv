package ru.emv.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fruit on 05.04.2017.
 */
@RestController
public class ButtonsController {
    @PostMapping("btn1")
    public void btn1() {
        System.out.println("btn1");
    }
}
