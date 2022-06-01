package org.example.ui;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//A class used as a medium to ensure information(username) could be transferred from one page to another
public class AppModel {
    private StringProperty text = new SimpleStringProperty();

    public AppModel()
    {
        this.text = new SimpleStringProperty();
    }

    public StringProperty textProperty() {
        return text;
    }

    public final String getText() {
        return textProperty().get();
    }

    public final void setText(String text) {
        textProperty().set(text);
    }
}
