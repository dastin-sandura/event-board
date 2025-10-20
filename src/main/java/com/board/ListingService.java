package com.board;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListingService {

    public List<Listing> getMockListings() {
        List<Listing> mockListings = new ArrayList<>();
        User author1 = new User();

        Listing listing1 = new Listing();
        listing1.setName("Event name 1");
        listing1.setDescription("Event description 1");
        listing1.setAuthor(author1);

        Listing listing2 = new Listing();
        listing2.setName("Event name 2");
        listing2.setDescription("Event description 2");
        listing2.setAuthor(author1);

        mockListings.add(listing1);
        mockListings.add(listing2);
        return mockListings;
    }
}
