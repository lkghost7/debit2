package by.itacademy.model;

import lombok.*;

import javax.persistence.*;
@Data
@ToString(exclude = "person")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "person_email")
public class PersonEmail {

    private String email;

    @OneToOne
    @JoinColumn(name = "id")
    private Person person;
}