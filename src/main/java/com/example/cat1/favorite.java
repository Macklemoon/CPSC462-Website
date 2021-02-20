package com.example.cat1;

public class favorite {

    public String id;
    public String description;
    public String fileName;
    public String userName;

    public favorite() {

    }
//TODO should append favorite ID,filename,description to the userName and form a list;
    public favorite(String userName, String description, String fileName) {
        this.id= userName;
        this.userName = userName;
        this.description = description;
        this.fileName = fileName;
    }


    public favorite(String description, String fileName) {
        this.description = description;
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "favorite{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", fileName='" + fileName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

