package neuronix.models.classification;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ClassificationResult {
    
    private StringProperty fileName;
    private StringProperty arrResults;
    private StringProperty result;
    
    public ClassificationResult (String fileName, String arrResults,
                                 String result) {
        this.fileName = new SimpleStringProperty(fileName);
        this.arrResults = new SimpleStringProperty(arrResults);
        this.result = new SimpleStringProperty(result);
    }
    
    public String getFileName () {
        return fileName.get();
    }
    
    public StringProperty fileNameProperty () {
        return fileName;
    }
    
    public String getArrResults () {
        return arrResults.get();
    }
    
    public StringProperty arrResultsProperty () {
        return arrResults;
    }
    
    public String getResult () {
        return result.get();
    }
    
    public StringProperty resultProperty () {
        return result;
    }
}