package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();

    static {
        items.add(new StackoverflowWebsite("1.1", "1.2", "http://www.iconsearch.ru/uploads/icons/web2/32x32/favorite_32x32.png", "1.4", "1.5"));
        items.add(new StackoverflowWebsite("2.1", "2.2", "http://www.iconsearch.ru/uploads/icons/web2/32x32/favorite_32x32.png", "2.4", "2.5"));
        items.add(new StackoverflowWebsite("3.1", "3.2", "http://www.iconsearch.ru/uploads/icons/web2/32x32/favorite_32x32.png", "3.4", "3.5"));
        items.add(new StackoverflowWebsite("4.1", "4.2", "http://www.iconsearch.ru/uploads/icons/web2/32x32/favorite_32x32.png", "4.4", "4.5"));
        items.add(new StackoverflowWebsite("5.1", "5.2", "http://www.iconsearch.ru/uploads/icons/web2/32x32/favorite_32x32.png", "5.4", "5.5"));
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
