/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author acer
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SOME_DATA_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreLine() {
        return scoreLine;
    }
    
    public void setScoreLine(String score) {
        String oldValue = scoreLine;
        scoreLine = score;
        propertySupport.firePropertyChange(SOME_DATA_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
