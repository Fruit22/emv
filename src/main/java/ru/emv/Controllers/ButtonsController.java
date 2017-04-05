package ru.emv.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fruit on 05.04.2017.
 */
@Controller
public class ButtonsController {

    @PostMapping("btn1")
    public String btn1() {
        System.out.println("btn1");
        return "index";
    }
}
