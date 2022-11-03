public class Lab11 {
    public static void main(String[] args) {

        /**
         * create three book objects
         */
        Book b1 = new Book("50 Shades of Grey", "E. L. James");
        Book b2 = new Book("The Communist Manifesto", "Karl Marx");
        Book b3 = new Book("Kama Sutra", "Vatsyayana Mallanaga");

        /**
         * print data from books
         */
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        /**
         * create bookshelf object with three book objects in it
         */
        Bookshelf bkS1 = new Bookshelf(3);
        bkS1.addBook(b1);
        bkS1.addBook(b2);
        bkS1.addBook(b3);

        /**
         * enhanced for loop to display contents of book objects in books ArrayList
         */
        for (Book newBook : bkS1.getBooks()) {
            System.out.println(newBook.toString());
        }

        /**
         * empty bookshelf and print results
         */
        bkS1.emptyBookshelf();
        for (Book newBook : bkS1.getBooks()) {
            System.out.println(newBook.toString());
        }
    }
}
