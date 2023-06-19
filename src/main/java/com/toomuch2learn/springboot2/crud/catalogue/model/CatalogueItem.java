package com.toomuch2learn.springboot2.crud.catalogue.model;

import com.toomuch2learn.springboot2.crud.catalogue.validation.IEnumValidator;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "product_catalogue")
public class CatalogueItem {
    public CatalogueItem() {
    }

    @Id
    private String id;

    @NotEmpty(message = "SKU cannot be null or empty")
    private String sku;

    @NotEmpty(message = "Name cannot be null or empty")
    private String name;

    @NotEmpty(message = "Description cannot be null or empty")
    private String description;

    @IEnumValidator(
        enumClazz = Category.class,
        message = "Invalid category provided"
    )
    private String category;

    @NotNull(message = "Price cannot be null or empty")
    private Double price;

    @NotNull(message = "Inventory cannot be null or empty")
    private Integer inventory;

    private LocalDate createdOn;

    private LocalDate updatedOn;
}
