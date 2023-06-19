package com.toomuch2learn.springboot2.crud.catalogue;

import com.toomuch2learn.springboot2.crud.catalogue.model.CatalogueItem;
import com.toomuch2learn.springboot2.crud.catalogue.model.Category;

import java.time.LocalDate;

public class TestDataHelper {

    public static CatalogueItem prepareCatalogueItem(String skuNumber) {
        return
            CatalogueItem.builder()
                .sku(skuNumber)
                .name("Catalog Item -"+skuNumber)
                .description("Catalog Desc - "+skuNumber)
                .category(Category.BOOKS.getValue())
                .price(10.00)
                .inventory(10)
                .createdOn(LocalDate.now())
                .build();
    }
}
