package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam13_06")
public class Chap13_06Controller {
    @GetMapping
    public String showForm(@ModelAttribute Person person) {
        return "viewPage13_06_form";
    }

    // @RequestBody는 폼의 input 태그의 name과 사용자가 입력된 값을 사용해서 키와 값으로 구성된 json형식의 Rest 문자열로 만듬
    @PutMapping
    public String submit(@ModelAttribute Person person, Model model) {
        model.addAttribute("data1", "@PutMapping 적용하기");
        model.addAttribute("data2", person);
        return "viewPage13_06_result";
    }
}
