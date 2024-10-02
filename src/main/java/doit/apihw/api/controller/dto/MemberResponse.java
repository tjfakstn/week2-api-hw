package doit.apihw.api.controller.dto;

import doit.apihw.domain.member.Member;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberResponse {
    private Long id;
    private String memberName;
    private LocalDate memberBirthday;
    private String memberLoginId;

    public static MemberResponse from(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .memberName(member.getMemberName())
                .memberBirthday(member.getMemberBirthday())
                .memberLoginId(member.getMemberLoginId())
                .build();
    }
}
