import java.util.List;

public interface Synonymable {

    void addSynonym(String value);

    void addSynonyms(String... values);

    void removeSynonym(int index);

    void removeRangeSynonym(int fromIndex, int toIndex);

    void removeAllSynonyms( );

    String getSynonym(int index);

    List<String> getSynonyms( );
}
