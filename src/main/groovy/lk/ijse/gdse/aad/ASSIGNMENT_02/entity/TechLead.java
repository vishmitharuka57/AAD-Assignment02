package lk.ijse.gdse.aad.ASSIGNMENT_02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table/*(name = "techlead")*/
public class TechLead implements SuperEntity {
    @Id
    private String tId;
    @Column(nullable = false)
    private String tName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String expertise;

}
