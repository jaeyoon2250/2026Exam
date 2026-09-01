package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exam13_05")
public class Chap13_05Controller {

    @GetMapping
    public List<Person> showForm(){
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("PolyKim");
        person1.setAge("30");
        person1.setEmail("PolyKim@kopo.ac.kr");

        Person person2 = new Person();
        person2.setName("HongGilDong");
        person2.setAge("25");
        person2.setEmail("HongGilDong@kopo.ac.kr");

        Person person3 = new Person();
        person3.setName("KimCheolSu");
        person3.setAge("40");
        person3.setEmail("KimCheolSu@kopo.ac.kr");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);
        return personList;
    }
}