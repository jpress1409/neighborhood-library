package com.pluralsight;

public class Book {

    private String name;
    private String isbn;
    private String checkedOutBy;
    private Boolean isCheckedOut;

    public Book(String name, String isbn, Boolean isCheckedOut) {
        this.name = name;
        this.isbn = isbn;
        this.checkedOutBy = checkedOutBy;
        this.isCheckedOut = isCheckedOut;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCheckedOutBy() {
        return checkedOutBy;
    }

    public void setCheckedOutBy(String checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", isbn: " + isbn + '\'' +
                ", Checked Out By:" + checkedOutBy + '\'' +
                ", Checked Out:" + isCheckedOut +
                '}';
    }
}
