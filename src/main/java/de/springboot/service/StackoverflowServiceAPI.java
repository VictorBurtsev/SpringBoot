package de.springboot.service;

import com.google.common.collect.ImmutableList;
import de.springboot.model.SiteDto;
import de.springboot.model.StackoverflowWebsite;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Service
public class StackoverflowServiceAPI {
    @Autowired
    private StackExchangeClient stackExchangeClient;

    public List<StackoverflowWebsite> findAll() {
        return stackExchangeClient.getSites().stream()
                .map(this::toStackoverflowWebsite)
                .filter(this::ignoreMeta)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    private boolean ignoreMeta(@NonNull StackoverflowWebsite stackoverflowWebsite) {
        return !stackoverflowWebsite.getId().startsWith("meta.");
    }


    private StackoverflowWebsite toStackoverflowWebsite(@NonNull SiteDto input) {
        return new StackoverflowWebsite(
                input.getSite_url().substring("http://".length(), input.getSite_url().length() - ".com".length()),
                input.getSite_url(),
                input.getFavicon_url(),
                input.getName(),
                input.getAudience());
    }
}
