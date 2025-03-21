import java.util.ArrayList;
import java.util.List;
public class Entity {
    private final String symbol;
    private List<EntityAttribute> attributes;

    Entity(String symbol, List<EntityAttribute> attributes) {
        this.symbol = symbol;
        this.attributes = attributes;
    }

    public Entity(String symbol) {
        this(symbol, null);
        this.attributes = new ArrayList<EntityAttribute>();
    }

    public List<EntityAttribute> getAttributes() {
        return this.attributes;
    }

    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


}
