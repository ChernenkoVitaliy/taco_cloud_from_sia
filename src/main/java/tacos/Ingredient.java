package tacos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
