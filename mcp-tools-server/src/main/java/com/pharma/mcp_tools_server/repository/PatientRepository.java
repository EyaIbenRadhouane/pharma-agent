package com.pharma.mcp_tools_server.repository;

import com.pharma.mcp_tools_server.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByEmailIgnoreCase(String email);
}