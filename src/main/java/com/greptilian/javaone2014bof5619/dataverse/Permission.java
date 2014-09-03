package com.greptilian.javaone2014bof5619.dataverse;

public enum Permission implements java.io.Serializable {

    Discover("See and search content"),
    Download("Download the file"),
    DestructiveEdit("Edits that cannot be reversed, such as deleting data");

    private final String description;

    Permission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
