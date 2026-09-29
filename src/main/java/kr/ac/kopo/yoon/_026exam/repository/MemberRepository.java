package kr.ac.kopo.yoon._026exam.repository;

import kr.ac.kopo.yoon._026exam.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member3, Integer>{

}