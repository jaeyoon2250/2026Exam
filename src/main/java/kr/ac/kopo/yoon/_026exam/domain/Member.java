package kr.ac.kopo.yoon._026exam.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Member {
    private String name;
    private MultipartFile fileImage;
}
