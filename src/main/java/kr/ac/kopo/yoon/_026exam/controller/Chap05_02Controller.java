package kr.ac.kopo.yoon._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Calendar;

@Controller
public class Chap05_02Controller {
    @GetMapping("/chap0502/{name}/{bornDate}")
    public String requestMethod2(@PathVariable("name") String name, @PathVariable("bornDate") int bornDate, Model model) {
        model.addAttribute("name", name);
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = CurrentYear - bornDate + 1;
        model.addAttribute("age", age);
        return "viewPage05_02";
    }
}