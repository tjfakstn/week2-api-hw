package doit.apihw.domain.member;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByMemberLoginId(String memberLoginId);
    // TODO : 회원 이름으로 회원 정보를 조회한다.
}
