package classesAndObjects;

public class AccessLibraryWithinPackage {
    public static void main(String[] args) {
        Library myLibrary = new Library("Package Library");
        myLibrary.openLibrary();
        myLibrary.closeLibrary();
        myLibrary.countVisitors();
    }
}
