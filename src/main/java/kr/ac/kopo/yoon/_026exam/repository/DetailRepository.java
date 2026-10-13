package kr.ac.kopo.yoon._026exam.repository;

import kr.ac.kopo.yoon._026exam.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {

}
