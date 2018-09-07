package ru.artbmstu.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "advertising", catalog = "")
public class CompanyEntity {
    private String id;
    private String companyName;
    private String description;
    private String address;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "company")
    private List<AdEntity> ads;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyEntity that = (CompanyEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, companyName, description, address);
    }
}
