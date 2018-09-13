package ru.artbmstu.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "advertising", catalog = "")
public class CategoryEntity {
    private String idcategory;
    private String categoryname;

    @Id
    @Column(name = "idcategory")
    public String getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(String idcategory) {
        this.idcategory = idcategory;
    }

    @Basic
    @Column(name = "categoryname")
    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    private List<AdEntity> ads;

    @OneToMany(mappedBy = "categoryEntity")
    public List<AdEntity> getAds() {
        return ads;
    }

    public void setAds(List<AdEntity> ads) {
        this.ads = ads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return Objects.equals(idcategory, that.idcategory) &&
                Objects.equals(categoryname, that.categoryname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcategory, categoryname);
    }
}
