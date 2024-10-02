package doit.apihw.api.controller.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class AuthSignUpRequest {
    private String memberName;
    private LocalDate memberBirthday;
    private String memberLoginId;
    private String memberPassword;
}
