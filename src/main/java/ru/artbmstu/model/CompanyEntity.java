package ru.artbmstu.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "advertising", catalog = "")
public class CompanyEntity {
    private String idcompany;
    private String companyname;
    private String description;
    private String address;

    @Id
    @Column(name = "idcompany")
    public String getIdcompany() {
        return idcompany;
    }

    public void setIdcompany(String idcompany) {
        this.idcompany = idcompany;
    }

    @Basic
    @Column(name = "companyname")
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyEntity that = (CompanyEntity) o;
        return Objects.equals(idcompany, that.idcompany) &&
                Objects.equals(companyname, that.companyname) &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcompany, companyname, description, address);
    }
}
