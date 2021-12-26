package com.example.submitssionform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @RequestMapping("/hello")
    public String edureka(){
        return "edureka.jsp";
    }


}
