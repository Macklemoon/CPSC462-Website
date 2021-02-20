package com.example.cat1;


public class ImageTable {

    public String id;
    public String fileName;
    public String description;

    public ImageTable() {
    }

    public ImageTable(String fileName) {
        this.fileName = fileName;
    }
    public ImageTable(String description, String fileName){
        this.description= description;
        this.fileName = fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ImageTable{" +
                "id='" + id + '\'' +
                ", fileName='" + fileName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
