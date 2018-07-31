public enum BookGenre {
    THRILLER("These are a little bit scary."),
    CRIME("These are where people do bad things."),
    ROMANTIC("These are where people fall in love and stuff."),
    COMEDY("These might make you laugh."),
    FANTASY("These have elves and goblins and things."),
    TEEN("These are for younger readers.");

    private final String description;

    BookGenre(String description){
        this.description = description;
    }
}
