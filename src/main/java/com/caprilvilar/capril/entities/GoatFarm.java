package com.caprilvilar.capril.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "goat_farms")
public class GoatFarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "tod")
    private String tod;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "goatFarm", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "goatFarm", fetch = FetchType.LAZY)
    private Set<Goat> goats = new HashSet<>();

    public GoatFarm() {}

    public GoatFarm(String name, Owner owner, Address address, String tod) {
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.tod = tod;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTod() { return tod; }
    public void setTod(String tod) { this.tod = tod; }
    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public Set<Phone> getPhones() { return phones; }
    public void setPhones(Set<Phone> phones) { this.phones = phones; }
    public Set<Goat> getGoats() { return goats; }
    public void setGoats(Set<Goat> goats) { this.goats = goats; }

    public void addPhone(Phone phone) {
        phones.add(phone);
        phone.setGoatFarm(this);
    }

    public void removePhone(Phone phone) {
        phones.remove(phone);
        phone.setGoatFarm(null);
    }

    public void addGoat(Goat goat) {
        goats.add(goat);
        goat.setGoatFarm(this);
    }

    public void removeGoat(Goat goat) {
        goats.remove(goat);
        goat.setGoatFarm(null);
    }
}