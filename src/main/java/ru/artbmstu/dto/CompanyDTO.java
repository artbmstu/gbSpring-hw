package ru.artbmstu.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.artbmstu.model.CompanyEntity;

@Data
@NoArgsConstructor
public class CompanyDTO {

    private String idcompany;
    private String companyname;
    private String description;
    private String address;

    public CompanyDTO(final CompanyEntity company){
        if (company == null) return;
        idcompany = company.getIdcompany();
        companyname = company.getCompanyname();
        description = company.getDescription();
        address = company.getAddress();
    }
}
