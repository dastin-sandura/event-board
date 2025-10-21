package com.board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ListingServiceTest {

    @Autowired
    private ListingService listingService;

    @Test
    void shouldReturnMockData() {
        Assertions.assertNotNull(listingService.getMockListings());
    }
}
