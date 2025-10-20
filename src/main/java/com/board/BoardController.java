package com.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    ListingService listingService;

    @GetMapping("listing")
    public ResponseEntity<List<Listing>> getBoardListings() {
        return ResponseEntity.ofNullable(listingService.getMockListings());
    }
}
