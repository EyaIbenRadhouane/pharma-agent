package com.pharma.mcp_tools_server.service;

import com.pharma.mcp_tools_server.entities.Medicament;
import com.pharma.mcp_tools_server.repository.MedicamentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Spring cree un Bean de cette classe
@AllArgsConstructor // Lombok genere le constructeur => injection automatique
public class ServiceMedicament implements IServiceMedicament {

    private final MedicamentRepository medicamentRepository;

    @Override
    public List<Medicament> rechercher(String nom, String indication) {
        // Un parametre absent devient "" : LIKE %% accepte alors toutes les valeurs
        String n = (nom == null) ? "" : nom.trim();
        String i = (indication == null) ? "" : indication.trim();
        return medicamentRepository.rechercher(n, i);
    }

    @Override
    public List<Medicament> getByNom(String nom) {
        return medicamentRepository.findFirstByNomIgnoreCase(nom == null ? "" : nom.trim());
    }

    @Override
    public List<Medicament> getAlternatives(String dci) {
        return medicamentRepository.findByDciIgnoreCaseAndStockGreaterThan(dci, 0);
    }
}