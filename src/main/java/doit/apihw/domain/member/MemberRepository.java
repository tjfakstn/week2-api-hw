package doit.apihw.domain.member;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByMemberLoginId(String memberLoginId);
    // TODO : 회원 이름으로 회원 정보를 조회한다.
    List<Member> findByMemberName(String memberName);

    // TODO : 회원 로그인 ID와 비밀번호로 회원 정보를 조회한다.
    Member findByMemberLoginIdAndMemberPassword(String memberLoginId, String memberPassword);

    // 생일이 특정 날짜 이전인 회원 정보를 조회한다.
    List<Member> findByMemberBirthdayBefore(LocalDate date);
}
