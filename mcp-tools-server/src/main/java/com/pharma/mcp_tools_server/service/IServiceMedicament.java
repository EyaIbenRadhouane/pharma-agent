package com.pharma.mcp_tools_server.service;

import com.pharma.mcp_tools_server.entities.Medicament;
import java.util.List;

public interface IServiceMedicament {
    List<Medicament> rechercher(String nom, String indication);
    List<Medicament> getByNom(String nom);
    List<Medicament> getAlternatives(String dci);
}