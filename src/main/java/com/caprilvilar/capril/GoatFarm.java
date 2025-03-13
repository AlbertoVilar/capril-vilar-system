package com.caprilvilar.capril;

import com.caprilvilar.capril.entities.Address;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.entities.Owner;
import com.caprilvilar.capril.entities.Phone;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "goat_farms")
public class GoatFarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String registrationNumber;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "goatFarm", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones;

    @OneToMany(mappedBy = "goatFarm", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Goat> goats;

    public GoatFarm() {}

    public GoatFarm(Long id, String name, String registrationNumber, Owner owner, Address address) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
        this.address = address;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public List<Phone> getPhones() { return phones; }
    public void setPhones(List<Phone> phones) { this.phones = phones; }
    public List<Goat> getGoats() { return goats; }
    public void setGoats(List<Goat> goats) { this.goats = goats; }
}
