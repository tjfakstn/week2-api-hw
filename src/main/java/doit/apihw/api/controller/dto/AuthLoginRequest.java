package doit.apihw.api.controller.dto;

import lombok.Data;

@Data
public class AuthLoginRequest {
    private String memberLoginId;
    private String memberPassword;
}
