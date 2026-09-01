package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @ResponseBody
    @GetMapping
    public Person showForm(){
        Person person = new Person();
        person.setName("PolyKim");
        person.setAge("30");
        person.setEmail("PolyKim@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}
