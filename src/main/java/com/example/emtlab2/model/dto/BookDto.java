package com.example.emtlab2.model.dto;
import com.example.emtlab2.model.enumerations.Category;
import lombok.Data;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
public class BookDto {

    private String name;
    private Long authorId;
    private Integer availableCopies;
    private Category category;

    public BookDto(String name, Category category, Long authorId, Integer availableCopies) {
        this.name = name;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
        this.category = category;
    }

    public BookDto() {

    }
}
