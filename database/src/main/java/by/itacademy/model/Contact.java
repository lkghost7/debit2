package by.itacademy.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Contact extends BaseEntity{
    private String workNumber;
    private String skype;
    private String name;

}
