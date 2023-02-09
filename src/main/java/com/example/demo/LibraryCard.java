package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value=EnumType.STRING)//to store the values in db in string format
    private CardStatus cardStatus;

    //Child class have the foreign key of the parent class : through which it connect to the other table
    @OneToOne   //Mapping relation between two entities
    @JoinColumn//add a foreign key column
    User user;//with whom OR with which table
}
