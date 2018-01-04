package com.impresee.domain.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by calvarez on 04-01-18.
 */

public class Image {
    public enum State{
        COMPLETED,
        IN_PROGRESS,
        INVALID
    }

    private String path;
    private State state;
    private List<Label> labels;

    public Image(String path){
        this.path = path;
        this.state = State.IN_PROGRESS;
        this.labels = new ArrayList<>();
    }

    public void addLabel(Label label){
        this.labels.add(label);
    }

    public void setState(State newState){
        this.state = newState;
    }

    public String getPath() {
        return path;
    }
}
