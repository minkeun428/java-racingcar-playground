package racinggame.model;

public class Name {
    private String name;
    private final int NAME_MAX = 5;
    private final int NAME_MIN = 1;

    public Name(String name) {
        validate(name.length());
        this.name = name;
    }

    private void validate(int length) {
        if (length > NAME_MAX || length < NAME_MIN) {
            throw new IllegalArgumentException();
        }
    }
}
