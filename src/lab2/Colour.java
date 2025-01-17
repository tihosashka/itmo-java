package lab2;

public enum Colour {
    Black(""),
    White(""),
    Grey("Серый"),
    Orange(""),
    Green(""),
    Blue("");

    private final String description;

    Colour(String description) {
        this.description = description;
    }
}
