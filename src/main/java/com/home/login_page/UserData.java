package com.home.login_page;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    @NotBlank
    @Length(min=4,max=9)
    @Schema(example = "admin")
    private String login;

    @NotBlank
    @Length(min=4,max=9)
    @Schema(example = "1234")
    private String password;
}
