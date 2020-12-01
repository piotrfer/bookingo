package pw.testoprog.bookingo.model.venue;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.util.UUID;


@Data
@Entity
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Venue {

    @Id
    @NonNull
    private UUID id;

    @NonNull
    private String name;

    public Venue(@NonNull UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Venue(@NonNull String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

}
