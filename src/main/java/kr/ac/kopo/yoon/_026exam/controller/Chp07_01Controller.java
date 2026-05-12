package kr.ac.kopo.yoon._026exam.controller;

import kr.ac.kopo.yoon._026exam.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/chap07")
public class Chp07_01Controller {

    @GetMapping("/form")
    public String requestForm() {
        return "viewFilePage";
    }

    @PostMapping("/form")
    public String requestFileUploadResult(@ModelAttribute Member member, Model model) {
//    public String requestFileUploadResult(@RequestParam("name") String name, @RequestParam("fileImage") MultipartFile file, Model model) {
//    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model) {

        String name = member.getName();
        MultipartFile file = member.getFileImage();

        String originFileName = file.getOriginalFilename();
        File saveFile = new File("d:\\upload\\"+name+"_"+originFileName);

        try {
            file.transferTo(saveFile);
            model.addAttribute("title", "파일업로드 결과 페이지");
            model.addAttribute("originFileName", originFileName);
            model.addAttribute("saveFileName", saveFile.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "viewFilePageResult";
    }
}
