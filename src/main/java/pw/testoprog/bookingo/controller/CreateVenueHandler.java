package pw.testoprog.bookingo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pw.testoprog.bookingo.model.venue.Venue;
import pw.testoprog.bookingo.model.venue.VenueDto;
import pw.testoprog.bookingo.model.venue.VenueRepository;
import pw.testoprog.bookingo.model.venue.VenueRepresentation;

@Service
@RequiredArgsConstructor
public class CreateVenueHandler {

    private final VenueRepository venueRepository;
    private final VenueRepresentationMapper venueRepresentationMapper;
    private final VenueDtoMapper venueDtoMapper;

    public VenueRepresentation handle(VenueDto venueDto) {
        Venue venue = venueDtoMapper.mapVenueDtoToVenue(venueDto);
        venue = venueRepository.save(venue);
        return venueRepresentationMapper.mapVenueToRepresentation(venue);
    }

}
