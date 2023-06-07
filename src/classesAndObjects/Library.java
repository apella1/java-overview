package classesAndObjects;

public class Library {
    public String libraryName;
    protected int noOfBooks;
    int visitorCount;
    private String librarianName;

    public Library(String name) {
        this.libraryName = name;
    }

    public void openLibrary() {
        System.out.println("Library is open!");
    }

    protected void closeLibrary() {
        System.out.println("Library is closed!");
    }

    void countVisitors() {
        System.out.println("The number of visitors is: " + visitorCount);
    }

    private void handleConfidentialInformation() {
        System.out.println("Handling confidential information!");
    }

}
