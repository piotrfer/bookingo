package pw.testoprog.bookingo.api.venue;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pw.testoprog.bookingo.controller.CreateVenueHandler;
import pw.testoprog.bookingo.controller.GetVenueByIdHandler;
import pw.testoprog.bookingo.model.venue.VenueDto;
import pw.testoprog.bookingo.model.venue.VenueRepresentation;
import javax.validation.Valid;


@RestController
@RequestMapping(path="/api/venue")
@RequiredArgsConstructor
public class VenueResource {

    private final CreateVenueHandler createVenueHandler;
    //private final GetVenueByIdHandler getVenueByIdHandler;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    VenueRepresentation createVenue(@Valid @RequestBody VenueDto venueDto) {
        return createVenueHandler.handle(venueDto);
    }


}
