INSERT IGNORE INTO medicaments (nom, dci, forme, indication, contre_indications, prix, stock) VALUES
-- Paracétamol : fièvre, douleur
('Doliprane 500', 'paracetamol', 'comprimé', 'fièvre, douleur', 'insuffisance hépatique sévère', 3.5, 120),
('Doliprane 1000', 'paracetamol', 'comprimé', 'fièvre, douleur', 'insuffisance hépatique sévère', 4.5, 80),
('Efferalgan 500', 'paracetamol', 'comprimé effervescent', 'fièvre, douleur', 'insuffisance hépatique sévère', 4.0, 60),
('Efferalgan 1000', 'paracetamol', 'comprimé effervescent', 'fièvre, douleur', 'insuffisance hépatique sévère', 5.2, 0),
('Panadol', 'paracetamol', 'comprimé', 'fièvre, douleur, maux de tête', 'insuffisance hépatique sévère', 3.0, 90),
-- Ibuprofène : douleur, inflammation, fièvre
('Advil 200', 'ibuprofene', 'comprimé', 'douleur, fièvre, inflammation', 'ulcère, grossesse, asthme, allergie aux AINS', 4.8, 70),
('Advil 400', 'ibuprofene', 'comprimé', 'douleur, fièvre, inflammation', 'ulcère, grossesse, asthme, allergie aux AINS', 5.9, 55),
('Nurofen 400', 'ibuprofene', 'comprimé', 'douleur, fièvre, inflammation', 'ulcère, grossesse, asthme, allergie aux AINS', 6.2, 0),
('Brufen 400', 'ibuprofene', 'comprimé', 'douleur, fièvre, inflammation', 'ulcère, grossesse, asthme, allergie aux AINS', 5.5, 40),
-- Aspirine
('Aspégic 500', 'aspirine', 'sachet', 'douleur, fièvre', 'ulcère, hémorragie, enfant de moins de 16 ans', 4.2, 45),
('Aspirine UPSA 500', 'aspirine', 'comprimé effervescent', 'douleur, fièvre', 'ulcère, hémorragie, enfant de moins de 16 ans', 4.0, 50),
-- Diclofénac
('Voltarène 50', 'diclofenac', 'comprimé', 'douleur articulaire, inflammation', 'ulcère, insuffisance rénale, grossesse', 8.5, 35),
('Cataflam 50', 'diclofenac', 'comprimé', 'douleur, inflammation', 'ulcère, insuffisance rénale, grossesse', 9.0, 25),
-- Antibiotiques
('Clamoxyl 500', 'amoxicilline', 'gélule', 'infection bactérienne (ORL, respiratoire)', 'allergie à la pénicilline', 7.5, 50),
('Clamoxyl 1g', 'amoxicilline', 'comprimé', 'infection bactérienne (ORL, respiratoire)', 'allergie à la pénicilline', 9.8, 40),
('Amoxil 500', 'amoxicilline', 'gélule', 'infection bactérienne (ORL, respiratoire)', 'allergie à la pénicilline', 7.0, 0),
('Zithromax 250', 'azithromycine', 'comprimé', 'infection bactérienne (angine, bronchite)', 'allergie aux macrolides, insuffisance hépatique', 14.5, 30),
-- Antihistaminiques : allergie, rhinite
('Zyrtec 10', 'cetirizine', 'comprimé', 'allergie, rhinite allergique, urticaire', 'insuffisance rénale sévère', 6.3, 55),
('Virlix 10', 'cetirizine', 'comprimé', 'allergie, rhinite allergique, urticaire', 'insuffisance rénale sévère', 5.8, 60),
('Clarityne 10', 'loratadine', 'comprimé', 'allergie, rhinite allergique', 'hypersensibilité à la loratadine', 6.9, 45),
-- Estomac
('Mopral 20', 'omeprazole', 'gélule', 'reflux, brûlures d''estomac, ulcère', 'hypersensibilité aux IPP', 9.8, 30),
('Losec 20', 'omeprazole', 'gélule', 'reflux, brûlures d''estomac, ulcère', 'hypersensibilité aux IPP', 10.5, 20),
('Inipomp 20', 'pantoprazole', 'comprimé', 'reflux, brûlures d''estomac', 'hypersensibilité aux IPP', 11.2, 25),
('Motilium 10', 'domperidone', 'comprimé', 'nausées, vomissements, digestion lente', 'troubles du rythme cardiaque', 7.8, 35),
('Spasfon', 'phloroglucinol', 'comprimé', 'douleurs abdominales, crampes digestives', 'aucune majeure', 5.4, 65),
-- Diarrhée
('Imodium 2mg', 'loperamide', 'gélule', 'diarrhée aiguë', 'enfant de moins de 2 ans, fièvre, sang dans les selles', 6.0, 40),
('Smecta', 'diosmectite', 'sachet', 'diarrhée, douleurs digestives', 'aucune majeure', 5.0, 55),
-- Respiratoire
('Ventoline', 'salbutamol', 'spray', 'asthme, crise de toux sifflante', 'hypersensibilité au salbutamol', 12.0, 28),
('Mucosolvan', 'ambroxol', 'sirop', 'toux grasse, bronches encombrées', 'ulcère gastrique évolutif', 8.2, 42),
('Vicks Toux Sèche', 'dextromethorphane', 'sirop', 'toux sèche', 'asthme, enfant de moins de 6 ans', 7.9, 38),
-- Diabète
('Glucophage 500', 'metformine', 'comprimé', 'diabète de type 2', 'insuffisance rénale, insuffisance hépatique', 6.5, 60),
('Stagid 700', 'metformine', 'comprimé', 'diabète de type 2', 'insuffisance rénale, insuffisance hépatique', 7.1, 45),
-- Vitamines
('Laroscorbine 1g', 'acide ascorbique', 'comprimé effervescent', 'fatigue, carence en vitamine C', 'calculs rénaux', 6.8, 50),
('Dolirhume', 'paracetamol', 'sachet', 'rhume, fièvre, maux de tête', 'insuffisance hépatique, hypertension sévère', 7.2, 30);

INSERT IGNORE INTO patients (nom, prenom, date_naissance, sexe, poids_kg, email, telephone, allergies) VALUES
('Ben Radhouane', 'Eya', '2020-05-12', 'M', 20, 'eya.ibenradhouane@polytechnicien.tn', '24075158', ''),
('Moussa', 'Leila', '1990-09-03', 'F', 62, 'leila.Moussa@example.com', '55123456', 'amoxicilline'),
('Gharbi', 'Ahmed', '1975-02-18', 'M', 85, 'ahmed.gharbi@example.com', '98123456', 'aspirine,ibuprofene'),
('Mansour', 'Yasmine', '2008-11-30', 'F', 52, 'yasmine.mansour@example.com', '22123456', '');