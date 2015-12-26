package com.boxfish.lhb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by boxfish on 15/12/21.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object home() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index() {
        return "index";
    }

}
