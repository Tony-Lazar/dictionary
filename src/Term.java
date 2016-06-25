import java.time.LocalDateTime;

public abstract class Term{

    private String _value;

    private String _translation;

    private String _usageExample;

    private String _usageExampleTranslation;

    private DifficultyLevel _difficultyLevel;

    private LocalDateTime _dateOfCreation;

    //-------------------------------------------------------------------------

    public String getValue() {
        return _value;
    }

    public String getTranslation() {
        return _translation;
    }

    public String getUsageExample() {
        return _usageExample;
    }

    public String getUsageExampleTranslation() {
        return _usageExampleTranslation;
    }

    public DifficultyLevel getDifficultyLevel() {
        return _difficultyLevel;
    }

    public LocalDateTime getDateOfCreation() {
        return _dateOfCreation;
    }

    //-------------------------------------------------------------------------

    

    //-------------------------------------------------------------------------

    public abstract Word newInstanceSimple(String value, String translation);

    public abstract Word newInstanceSimple(String value, String translation, DifficultyLevel difficultyLevel);

    public abstract Word newInstanceWithExample(String value, String translation, String usageExample, String usageExampleTranslation);

    public abstract Word newInstanceWithExample(String value, String translation, String usageExample, String usageExampleTranslation, DifficultyLevel difficultyLevel);

}