package pw.testoprog.bookingo.model.venue;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class VenueDto {
    @NotNull
    String name;
}
