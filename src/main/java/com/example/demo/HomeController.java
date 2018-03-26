package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

        @RequestMapping("/loadForm")
        public String loadFormPage() {
            //System.out.println(''in the loadForm method'');
            return "formtemplate";
        }
        @RequestMapping("/processForm")
        public String loadFromPage(@RequestParam("login") String login, Model model) {
            System.out.println(login);
            model.addAttribute("loginval", login);
            return "confirm";
        }
}
