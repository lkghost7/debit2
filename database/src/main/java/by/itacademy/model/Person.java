package by.itacademy.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person extends BaseEntity{
    private String name;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contactId;
}
