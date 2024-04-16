package org.example.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String passportNumber;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @OneToOne(mappedBy = "passport", fetch = FetchType.EAGER)
    private Person person;
}
