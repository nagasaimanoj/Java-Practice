class Book {
    public String title;
    public String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Main{
    public static void main (String[] args){

        java.util.List<Book> books = new java.util.ArrayList<Book>();
        books.add(new Book("EffectiveJ Java", "Joshua Bloch"));
        books.add(new Book("Thinking in Java", "Bruce Eckel"));
        books.add(new Book("Java: The Complete Reference", "Herbert Schildt"));
        
        for(Book bk : new Library(books).getTotalBooksInLibrary()){
            System.out.println("Title : " + bk.title + " and "+" Author : " + bk.author);
        }
        public String getName(){
            return author;
        }
        public void setTitle(String tit) {
            title = tit;
        }
        public String getTitle(){
            return title;
        }
    }
}

class Library {
    private final java,util.List<Book> books;

    Library(java.util.List<Book> books) {
        this.books = books;
    }

    public java.util.List<Book> getTotalBooksInLibrary() {
        return books;
    }
}