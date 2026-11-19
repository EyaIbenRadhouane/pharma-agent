package com.pharma.mcp_tools_server.repository;
import com.pharma.mcp_tools_server.entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

    // Derived queries
    List<Medicament> findFirstByNomIgnoreCase(String nom);
    List<Medicament> findByDciIgnoreCaseAndStockGreaterThan(String dci, int stock);

    // JPQL : recherche multicritère (nom OU dci, ET indication)
    @Query("""
        SELECT m FROM Medicament m
        WHERE (:nom IS NULL OR LOWER(m.nom) LIKE LOWER(CONCAT('%', :nom, '%'))
                            OR LOWER(m.dci) LIKE LOWER(CONCAT('%', :nom, '%')))
          AND (:indication IS NULL OR LOWER(m.indication) LIKE LOWER(CONCAT('%', :indication, '%')))
        """)
    List<Medicament> rechercher(@Param("nom") String nom,
                                @Param("indication") String indication);
}
