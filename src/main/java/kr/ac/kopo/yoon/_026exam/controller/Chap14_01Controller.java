package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Member3;
import kr.ac.kopo.yoon._026exam.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam14_01")
public class Chap14_01Controller {
    @Autowired
    MemberRepository repository;

    @GetMapping
    public String viewHomePage(Model model) {
        Iterable<Member3> memberList =  repository.findAll();
        model.addAttribute("memberList", memberList);
        return "viewPage02";
    }

    @GetMapping("/new")
    public String newInputMember3(Model model) {
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "viewPage02_new";
    }

    @PostMapping("/insert")
    public String insertMember3(@ModelAttribute("member") Member3 member3) {
        repository.save(member3);
        return "redirect:/exam14_01";
    }
}
