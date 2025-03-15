SELECT
    cabra.registration_number AS cabra_registro,
    cabra.name AS cabra_nome,

    pai.registration_number AS pai_registro,
    pai.name AS pai,

    mae.registration_number AS mae_registro,
    mae.name AS mae,

    -- Avós paternos
    avo_paterno_pai.registration_number AS avo_paterno_registro,
    avo_paterno_pai.name AS avo_paterno,

    avo_paterno_mae.registration_number AS avo_paterna_registro,
    avo_paterno_mae.name AS avo_paterna,

    -- Avós maternos
    avo_materno_pai.registration_number AS avo_materno_registro,
    avo_materno_pai.name AS avo_materno,

    avo_materno_mae.registration_number AS avo_materna_registro,
    avo_materno_mae.name AS avo_materna,

    -- Bisavós paternos
    bisavo_paterno_paterno.registration_number AS bisavo_paterno_paterno_registro,
    bisavo_paterno_paterno.name AS bisavo_paterno_paterno,

    bisavo_paterno_materno.registration_number AS bisavo_paterno_materno_registro,
    bisavo_paterno_materno.name AS bisavo_paterno_materno,

    -- Bisavós maternos
    bisavo_materno_paterno.registration_number AS bisavo_materno_paterno_registro,
    bisavo_materno_paterno.name AS bisavo_materno_paterno,

    bisavo_materno_materno.registration_number AS bisavo_materno_materno_registro,
    bisavo_materno_materno.name AS bisavo_materno_materno
FROM goats cabra
LEFT JOIN goats pai ON cabra.father_id = pai.registration_number
LEFT JOIN goats mae ON cabra.mother_id = mae.registration_number

-- Avós paternos (pai do pai e mãe do pai)
LEFT JOIN goats avo_paterno_pai ON pai.father_id = avo_paterno_pai.registration_number
LEFT JOIN goats avo_paterno_mae ON pai.mother_id = avo_paterno_mae.registration_number

-- Avós maternos (pai da mãe e mãe da mãe)
LEFT JOIN goats avo_materno_pai ON mae.father_id = avo_materno_pai.registration_number
LEFT JOIN goats avo_materno_mae ON mae.mother_id = avo_materno_mae.registration_number

-- Bisavós paternos (pai do avô paterno e mãe do avô paterno)
LEFT JOIN goats bisavo_paterno_paterno ON avo_paterno_pai.father_id = bisavo_paterno_paterno.registration_number
LEFT JOIN goats bisavo_paterno_materno ON avo_paterno_pai.mother_id = bisavo_paterno_materno.registration_number

-- Bisavós maternos (pai do avô materno e mãe do avô materno)
LEFT JOIN goats bisavo_materno_paterno ON avo_materno_pai.father_id = bisavo_materno_paterno.registration_number
LEFT JOIN goats bisavo_materno_materno ON avo_materno_pai.mother_id = bisavo_materno_materno.registration_number

WHERE cabra.registration_number = '164622010';
