package com.secil.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SaveYayineviRequestDto {
    @NotBlank
    @Size(min=3)
    String ad;
    String adres;
    String telefon;
}
