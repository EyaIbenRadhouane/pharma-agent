package com.pharma.mcp_tools_server.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "medicaments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;     // nom commercial
    private String dci;     // principe actif (lien avec le CSV et les allergies)
    private String forme;
    private String indication;

    @Column(length = 500)
    private String contreIndications;

    private double prix;
    private int stock;
    // Medicament.java
    @OneToMany(mappedBy = "medicament", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Prescription> prescriptions;
}