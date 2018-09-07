package ru.artbmstu.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "advertising", catalog = "")
public class CategoryEntity {
    private String idcategory;
    private String categoryName;

    @Id
    @Column(name = "idcategory")
    public String getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(String idcategory) {
        this.idcategory = idcategory;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @OneToMany(mappedBy = "category")
    private List<AdEntity> ads;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return Objects.equals(idcategory, that.idcategory) &&
                Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idcategory, categoryName);
    }
}
