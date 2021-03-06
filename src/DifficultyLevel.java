public enum DifficultyLevel {
    FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5);

    DifficultyLevel(int level) {
        this.level = level;
    }

    private int level;

    public int getLevel() {
        return level;
    }
}