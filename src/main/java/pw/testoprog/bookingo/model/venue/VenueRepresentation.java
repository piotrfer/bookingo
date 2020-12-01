package pw.testoprog.bookingo.model.venue;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class VenueRepresentation {
    UUID id;
    String name;
}
