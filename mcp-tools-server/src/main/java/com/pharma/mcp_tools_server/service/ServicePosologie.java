package com.pharma.mcp_tools_server.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class ServicePosologie implements IServicePosologie {

    // Colonnes du CSV : 0=dci 1=ageMin 2=ageMax 3=poidsMin 4=poidsMax 5=doseMg 6=frequence 7=doseMaxJourMg
    @Override
    public List<Map<String, Object>> calculer(String dci, int age, double poidsKg) {
        List<Map<String, Object>> resultat = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File("src/main/resources/posologies.csv"));
            sc.nextLine(); // on saute la ligne d'en-tete

            while (sc.hasNextLine()) {
                String ligne = sc.nextLine();
                if (ligne.isBlank()) continue;
                String[] c = ligne.split(",");

                int ageMin = Integer.parseInt(c[1].trim());
                int ageMax = Integer.parseInt(c[2].trim());
                double poidsMin = Double.parseDouble(c[3].trim());
                double poidsMax = Double.parseDouble(c[4].trim());

                if (c[0].trim().equalsIgnoreCase(dci.trim())
                        && age >= ageMin && age <= ageMax
                        && poidsKg >= poidsMin && poidsKg <= poidsMax) {

                    Map<String, Object> p = new HashMap<>();
                    p.put("dci", c[0].trim());
                    p.put("doseMg", Integer.parseInt(c[5].trim()));
                    p.put("frequence", c[6].trim());
                    p.put("doseMaxJourMg", Integer.parseInt(c[7].trim()));
                    p.put("tranche", ageMin + " a " + ageMax + " ans, " + poidsMin + " a " + poidsMax + " kg");
                    resultat.add(p);
                }
            }
            sc.close();

        } catch (Exception e) {
            throw new RuntimeException("Fichier posologies.csv introuvable");
        }

        return resultat; // liste vide = aucune posologie trouvee
    }
}