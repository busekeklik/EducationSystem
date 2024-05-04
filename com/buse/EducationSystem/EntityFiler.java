package com.buse.EducationSystem;

//IMPROVEMENT
public class EntityFiler {
    protected String filePath;
    protected String fieldDelimiter = ";";

    public EntityFiler(String filePath) {
        this.filePath = filePath;
    }

    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
