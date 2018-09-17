package ru.artbmstu.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.model.CategoryEntity;
import ru.artbmstu.model.CompanyEntity;

@Data
@NoArgsConstructor
public class CategoryDTO {

    private String idcategory;
    private String categoryname;

    public CategoryDTO(final CategoryEntity category){
        if (category == null) return;
        idcategory = category.getIdcategory();
        categoryname = category.getCategoryname();
    }
}
