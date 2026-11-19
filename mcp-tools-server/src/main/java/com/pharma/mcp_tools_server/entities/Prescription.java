package com.pharma.mcp_tools_server.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "prescriptions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String posologie;
    private int dureeJours;
    private LocalDateTime datePrescription;
    private boolean emailEnvoye;

    // ===== Relation vers Patient =====
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // ===== Relation vers Medicament =====
    @ManyToOne
    @JoinColumn(name = "medicament_id")
    private Medicament medicament;
}