package fr.icdc.ebad.web.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CreationAccreditationRequestDto {
    @NotNull
    private boolean wantManage;

    @NotNull
    private boolean wantUse;

    @NotNull
    private Long applicationId;
}
