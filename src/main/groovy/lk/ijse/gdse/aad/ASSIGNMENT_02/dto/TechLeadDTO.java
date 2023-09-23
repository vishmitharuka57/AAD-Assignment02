package lk.ijse.gdse.aad.ASSIGNMENT_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLeadDTO {
    private String tId;
    private String tName;
    private String email;
    private String expertise;

   /* public TechLeadDTO(String tId,String tName,String email,String expertise){
        this.tId = tId;
        this.tName = tName;
        this.email = email;
        this.expertise = expertise;


    }*/
}
