package org.bate.mapflatmap;

import java.util.List;

public class ClientDetails {
    private String name;
    private int id;
    private String emailAddress;
    private List<String> contact;

    public ClientDetails() {
    }

    public ClientDetails(String name, int id, String emailAddress, List<String> contact) {
        this.name = name;
        this.id = id;
        this.emailAddress = emailAddress;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ClientDetails{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", contact=" + contact +
                '}';
    }
}
