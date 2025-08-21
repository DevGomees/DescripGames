package com.tohelp.feedbacks.dto;

public class ReplancementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    public ReplancementDTO() {
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }
}
