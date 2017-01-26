package de.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class StackoverflowWebsite {
    public String id;
    public String website;
    public String iconImageUrl;
    public String title;
    public String description;

}
