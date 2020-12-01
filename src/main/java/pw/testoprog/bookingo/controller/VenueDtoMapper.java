package pw.testoprog.bookingo.controller;

import org.springframework.stereotype.Service;
import pw.testoprog.bookingo.model.venue.Venue;
import pw.testoprog.bookingo.model.venue.VenueDto;

import java.util.UUID;

@Service
public class VenueDtoMapper {
    public Venue mapVenueDtoToVenue(VenueDto venueDto) {
        return new Venue(venueDto.getName());
    }
}
