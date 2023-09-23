package lk.ijse.gdse.aad.ASSIGNMENT_02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table/*(name = "project")*/
public class Project implements SuperEntity {
    @Id
    private String pId;
    @Column(nullable = false)
    private String pName;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDate startDate;
}
