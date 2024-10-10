package com.pluralsight;

public class Book {

    private String name;
    private String isbn;
    private String checkedOutBy;
    private static Boolean isCheckedOut;
    private int id;

    public Book(int id, String name, String isbn, Boolean isCheckedOut) {
        this.name = name;
        this.isbn = isbn;
        this.checkedOutBy = checkedOutBy;
        this.isCheckedOut = isCheckedOut;
        this.id = id;
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

    public String getCheckedOutBy(String userName) {
        return checkedOutBy;
    }

    public void setCheckedOutBy(String checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public static Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
