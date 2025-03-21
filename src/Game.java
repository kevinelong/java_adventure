import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    List<Entity> entities = new ArrayList<Entity>();
    String name = "Java Adventure";

    Game(){
        entities.add(new Entity("@"));
        entities.add(new Entity("Z"));
    }

    @Override
    public String toString() {
        return this.entities.stream()
                .map(Entity::getSymbol)
                .collect(Collectors.joining(", "));
    }
}
