package doit.apihw.api.controller.dto;

import lombok.Data;

@Data
public class AuthNameChangeRequest {
    private String oldName;
    private String newName;
}
