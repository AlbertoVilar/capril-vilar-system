package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.GoatGenealogyDTO;
import com.caprilvilar.capril.dtos.GrandparentDTO;
import com.caprilvilar.capril.dtos.GreatGrandparentDTO;
import com.caprilvilar.capril.dtos.ParentsDTO;
import com.caprilvilar.capril.entities.Goat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component; // Adicione esta importação

@Component // Adicione esta anotação
public class GoatGenealogyMapper {

    public GoatGenealogyDTO toDTO(Goat goat) {
        GoatGenealogyDTO dto = new GoatGenealogyDTO();

        dto.setRegistrationNumber(goat.getRegistrationNumber());
        dto.setName(goat.getName());
        dto.setBreed(goat.getBreed());
        dto.setColor(goat.getColor());
        dto.setStatus(goat.getStatus() != null ? goat.getStatus().toString() : null);
        dto.setGender(goat.getGender());
        dto.setCategory(goat.getCategory());
        dto.setTod(goat.getTod());
        dto.setToe(goat.getToe());
        dto.setBirthDate(goat.getBirthDate());
        dto.setActive(goat.isActive());

        // Mapeando os pais
        dto.setParents(mapParents(goat));

        // Mapeando os avós
        dto.setGrandparents(mapGrandparents(goat));

        // Mapeando os bisavós
        dto.setGreatGrandparents(mapGreatGrandparents(goat));

        return dto;
    }

    private ParentsDTO mapParents(Goat goat) {
        if (goat.getFather() == null && goat.getMother() == null) {
            return null;
        }

        return new ParentsDTO(
                goat.getFather() != null ? goat.getFather().getName() : null,
                goat.getFather() != null ? goat.getFather().getRegistrationNumber() : null,
                goat.getMother() != null ? goat.getMother().getName() : null,
                goat.getMother() != null ? goat.getMother().getRegistrationNumber() : null
        );
    }

    private List<GrandparentDTO> mapGrandparents(Goat goat) {
        List<GrandparentDTO> grandparents = new ArrayList<>();

        if (goat != null) {
            if (goat.getFather() != null) {
                if (goat.getFather().getFather() != null) {
                    grandparents.add(new GrandparentDTO(
                            goat.getFather().getFather().getName(),
                            goat.getFather().getFather().getRegistrationNumber()
                    ));
                }
                if (goat.getFather().getMother() != null) {
                    grandparents.add(new GrandparentDTO(
                            goat.getFather().getMother().getName(),
                            goat.getFather().getMother().getRegistrationNumber()
                    ));
                }
            }

            if (goat.getMother() != null) {
                if (goat.getMother().getFather() != null) {
                    grandparents.add(new GrandparentDTO(
                            goat.getMother().getFather().getName(),
                            goat.getMother().getFather().getRegistrationNumber()
                    ));
                }
                if (goat.getMother().getMother() != null) {
                    grandparents.add(new GrandparentDTO(
                            goat.getMother().getMother().getName(),
                            goat.getMother().getMother().getRegistrationNumber()
                    ));
                }
            }
        }

        return grandparents;
    }

    private List<GreatGrandparentDTO> mapGreatGrandparents(Goat goat) {
        List<GreatGrandparentDTO> greatGrandparents = new ArrayList<>();

        if (goat != null) {
            if (goat.getFather() != null) {
                greatGrandparents.addAll(mapGreatGrandparentsFromParent(goat.getFather()));
            }

            if (goat.getMother() != null) {
                greatGrandparents.addAll(mapGreatGrandparentsFromParent(goat.getMother()));
            }
        }

        return greatGrandparents;
    }

    private List<GreatGrandparentDTO> mapGreatGrandparentsFromParent(Goat parent) {
        List<GreatGrandparentDTO> greatGrandparents = new ArrayList<>();

        if (parent != null) {
            if (parent.getFather() != null) {
                if (parent.getFather().getFather() != null) {
                    greatGrandparents.add(new GreatGrandparentDTO(
                            parent.getFather().getFather().getName(),
                            parent.getFather().getFather().getRegistrationNumber()
                    ));
                }
                if (parent.getFather().getMother() != null) {
                    greatGrandparents.add(new GreatGrandparentDTO(
                            parent.getFather().getMother().getName(),
                            parent.getFather().getMother().getRegistrationNumber()
                    ));
                }
            }

            if (parent.getMother() != null) {
                if (parent.getMother().getFather() != null) {
                    greatGrandparents.add(new GreatGrandparentDTO(
                            parent.getMother().getFather().getName(),
                            parent.getMother().getFather().getRegistrationNumber()
                    ));
                }
                if (parent.getMother().getMother() != null) {
                    greatGrandparents.add(new GreatGrandparentDTO(
                            parent.getMother().getMother().getName(),
                            parent.getMother().getMother().getRegistrationNumber()
                    ));
                }
            }
        }

        return greatGrandparents;

    }
}