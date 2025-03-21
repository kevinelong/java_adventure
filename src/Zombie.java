import java.util.List;

public class Zombie extends Entity {
    Zombie() {
        super("Z", new List<EntityAttribute>(
                new EntityAttribute("Strength", 50),
                new EntityAttribute("Dexterity", 50),
                new EntityAttribute("Health", 50)
        ));
    }
}
