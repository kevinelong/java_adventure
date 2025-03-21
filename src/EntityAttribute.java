public class EntityAttribute {
    private final String name;
    private final Integer value;

    EntityAttribute(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "EntityAttribute{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
