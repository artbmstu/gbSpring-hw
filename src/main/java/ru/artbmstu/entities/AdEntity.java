package ru.artbmstu.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ad", schema = "advertising", catalog = "")
public class AdEntity {
    private String idad;
    private String adName;
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
    @Column(name = "ad_name")
    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
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

    @ManyToOne
    @JoinColumn(name = "id_company")
    public CompanyEntity company;

    @ManyToOne
    @JoinColumn(name = "id_category")
    public CategoryEntity category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdEntity adEntity = (AdEntity) o;
        return Objects.equals(idad, adEntity.idad) &&
                Objects.equals(adName, adEntity.adName) &&
                Objects.equals(content, adEntity.content) &&
                Objects.equals(phone, adEntity.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idad, adName, content, phone);
    }
}
