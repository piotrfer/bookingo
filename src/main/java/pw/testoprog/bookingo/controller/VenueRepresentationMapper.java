package pw.testoprog.bookingo.controller;

import org.springframework.stereotype.Service;
import pw.testoprog.bookingo.model.venue.Venue;
import pw.testoprog.bookingo.model.venue.VenueRepresentation;

@Service
public class VenueRepresentationMapper {

    public VenueRepresentation mapVenueToRepresentation(Venue venue) {
        return new VenueRepresentation(venue.getId(), venue.getName());
    }

}
