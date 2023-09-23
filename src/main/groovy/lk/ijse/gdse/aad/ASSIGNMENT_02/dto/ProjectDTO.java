package lk.ijse.gdse.aad.ASSIGNMENT_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO {
    private String pId;
    private String pName;
    private String description;
    private LocalDate startDate;

}
