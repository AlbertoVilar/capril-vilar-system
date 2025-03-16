package com.caprilvilar.capril.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = true)
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "goat_farm_id", nullable = true)
    private GoatFarm goatFarm;

    public Phone() {}

    public Phone(Long id, String number, Owner owner, GoatFarm goatFarm) {
        this.id = id;
        this.number = number;
        this.owner = owner;
        this.goatFarm = goatFarm;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
    public GoatFarm getGoatFarm() { return goatFarm; }
    public void setGoatFarm(GoatFarm goatFarm) { this.goatFarm = goatFarm; }
}
