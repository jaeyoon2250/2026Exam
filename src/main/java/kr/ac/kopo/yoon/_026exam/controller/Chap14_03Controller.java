package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Detail;
import kr.ac.kopo.yoon._026exam.domain.Product2;
import kr.ac.kopo.yoon._026exam.repository.DetailRepository;
import kr.ac.kopo.yoon._026exam.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam14_03")
public class Chap14_03Controller {
    @Autowired
    private Product2Repository product2Repository;

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public String requestInsert(Model model) {
        Product2 product2 = new Product2();
        Detail detail = new Detail();

        product2.setName("아이폰 Duo");
        product2.setPrice(3290000);

        detail.setDescription("애플의 첫 폴더블 스마트폰");
        detail.setWeight(300);
        detail.setWidth(124.5f);
        detail.setHeight(132.7f);
        product2.setDetail(detail);

        product2Repository.save(product2);
        Iterable<Product2> product2List = product2Repository.findAll();
        Iterable<Detail> detailList = detailRepository.findAll();

        model.addAttribute("product2List", product2List);
        model.addAttribute("detailList", detailList);

        return "viewPage04";
    }
}
