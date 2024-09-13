package org.example;

public class Books {
    String authorName;
    String publication;
    int pubYear;
    String journal;
    int numOfPages;
    String edition;



    //Constructor, It calls when we create an object for this Books class
    // Default Consturctor
    Books()
    {
        this.authorName = "Sunil";
        this.publication = "CBEJCE";
    }



    //Parameterized Constructor with two Param
    Books(String authorName,int pubYear)
    {
        this.authorName = authorName;
        this.pubYear = pubYear;
    }

    Books(String edition)
    {
        this.edition = edition;
    }

    void assignValues(String authorName,
                      String publication,
                      int pubYear,
                      String journal,
                      int numOfPages,String edition)
    {
        this.publication = publication;
        this.authorName = authorName;
        this.pubYear = pubYear;
        this.journal = journal;
        this.numOfPages = numOfPages;
        this.edition = edition;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
