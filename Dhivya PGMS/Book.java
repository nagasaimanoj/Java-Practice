class Book {
    private int id;
    private String name, author, publiser;
    private int quantity;

    public Book(int id, String name, String author, String publiser, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publiser = publiser;
        this.quantity = quantity;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
=======
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
    }

    @Override
    public String toString() {
        return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
<<<<<<< HEAD
        + quantity;
    }
}
=======
                + quantity;
    }
}
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
