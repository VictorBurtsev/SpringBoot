package de.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StackoverflowWebsite {
    public String id;
    public String website;
    public String iconImageUrl;
    public String title;
    public String description;

}
