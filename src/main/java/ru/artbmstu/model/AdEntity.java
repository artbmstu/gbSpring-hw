package ru.artbmstu.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ad", schema = "advertising", catalog = "")
public class AdEntity {
    private String idad = UUID.randomUUID().toString();
    private String adname;
    private String content;
    private String phone;

    @Id
    @Column(name = "idad")
    public String getIdad() {
        return idad;
    }

    public void setIdad(String idad) {
        this.idad = idad;
    }

    @Basic
    @Column(name = "adname")
    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdEntity adEntity = (AdEntity) o;
        return Objects.equals(idad, adEntity.idad) &&
                Objects.equals(adname, adEntity.adname) &&
                Objects.equals(content, adEntity.content) &&
                Objects.equals(phone, adEntity.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idad, adname, content, phone);
    }

    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    private CompanyEntity companyEntity;

    @ManyToOne
    @JoinColumn(name = "idcompany")
    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }
}
