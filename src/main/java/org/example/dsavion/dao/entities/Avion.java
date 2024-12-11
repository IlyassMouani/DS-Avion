package org.example.dsavion.dao.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_Avion;
    private String model;
    private String color;
    private String matricul;
    private Long Price;


}
