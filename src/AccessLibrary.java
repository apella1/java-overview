import classesAndObjects.Library;

public class AccessLibrary {
    public static void main(String[] args) {
        Library library = new Library("The Libray Of Choice");

        library.openLibrary();
        System.out.println(library.libraryName);
    }
}
