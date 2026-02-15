package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @Column(name = "first_name", nullable = false, length = 80)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 80)
    private String lastName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "phone", length = 40)
    private String phone;

    @Column(name = "email", length = 120)
    private String email;

    // JPA no-arg constructor
    protected Client() {
    }

    // All-args constructor initializing all instance variables (except auto-generated id)
    public Client(Advisor advisor,
                  String firstName,
                  String lastName,
                  String address,
                  String phone,
                  String email) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getters (no setter for id)
    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
