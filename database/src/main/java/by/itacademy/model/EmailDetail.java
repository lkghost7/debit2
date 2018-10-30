package by.itacademy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Table (name = "email_detail")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetail extends BaseEntity {
    @Column(name = "name")
     private String email;
}
