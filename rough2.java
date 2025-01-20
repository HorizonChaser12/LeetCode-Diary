//
//        class and attributes.
//        Author
//        authorId:Integer
//        author name:String
//        Book
//        bookId:Integer
//        title:String
//        genre:String
//        price:double
//        author:Author
//        Create a business
//
//        class and the following functionalities:
//        getBooksBelongingToGenre:
//        -This method will take a list of book and genre as input parameters.
//        -It should find the books matching the genre and apply the discount to the book.
//        -It should return list of books matching the genre after discount.The output should be printed followed by the below text.
//        "Discounted<genre> books:"
//        Notes
//        -all string comparisons need to be case insensitive.
//        -Assume an author has written only one book.
//        Sample Input and output:
//        1. First,read the number of author objects to be added to the array/list.
//        2. Next,read the attributes for each author object in the mentioned sequence.
//        3. Read the attributes for each book object.
//        4. Repeat steps 2to 3 for the number of author objects in the first line of input
//        5. Next,read the parameters to be passed to the respective methods.

//        Input:

//        101
//        Agatha Christie
//        11
//        Murder on the oriental Express
//        Crime
//        20.22

//        Output:

//        AuthorName: Agatha Christie, Title: Murder on the Orient Express
//        AuthorName: Arthur Conan Doyle, Title: The Hound of the BaskerVilles

//        Discounted Fantasy Books:
//        AuthorName: Clayton Emery, Title: The Burning Goddess, Updated Price: 24.0
//        AuthorName: Trisha Ashley, Title: Wedding Tiers, Updated Price: 28.0



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rough2 {
//    static class Author{
//        Integer authorID;
//        String authorName;
//        Author(Integer authorID,String authorName){
//            this.authorID=authorID;
//            this.authorName=authorName;
//        }
//    }
    static class Book{
        Integer authorID;
        String authorName;
        Integer bookId;
        String title;
        String genre;
        double price;

        Book(Integer authorID,String authorName,Integer bookId,String title,String genre,double price){
            this.authorID=authorID;
            this.authorName=authorName;
            this.bookId=bookId;
            this.title=title;
            this.genre=genre;
            this.price=price;
        }
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        Book[] book = new Book[n];
        for (int i = 0; i < book.length; i++) {
            Integer authorID = SC.nextInt();
            SC.nextLine();
            String authorName = SC.nextLine();
            Integer bookID = SC.nextInt();
            SC.nextLine();
            String title=SC.nextLine();
            String genre = SC.nextLine();
            double price = SC.nextDouble();
            SC.nextLine();
            book[i]=new Book(authorID,authorName,bookID,title,genre,price);
        }
        String genre1 = SC.nextLine();
        String genre2 = SC.nextLine();
        double discount = SC.nextDouble();
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].authorID);
            System.out.println(book[i].authorName);
            System.out.println(book[i].bookId);
            System.out.println(book[i].title);
            System.out.println(book[i].genre);
            System.out.println(book[i].price);
        }
        List<Book> ans = getBooksBelongingToGenre(book,genre1,discount);
        System.out.println("Discounted "+genre1+" books:");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Author Name: "+ans.get(i).authorName+", Title: "+ans.get(i).title);
        }
        System.out.println();
        List<Book> ans2 = getBooksBelongingToGenre(book,genre2,discount);
        System.out.println("Discounted "+genre2+" books:");
        for (int i = 0; i < ans2.size(); i++) {
            System.out.println("Author Name: "+ans2.get(i).authorName+", Title: "+ans2.get(i).title);
        }

    }
    static List<Book> getBooksBelongingToGenre(Book[] book,String genre,double discount){
        List<Book> ans = new ArrayList<>();
        for (int i = 0; i < book.length; i++) {
            if (book[i].genre.equalsIgnoreCase(genre)){
                book[i].price-=book[i].price*(discount/100);
                ans.add(book[i]);
            }
        }
        return ans;
    }
    static List<Book> getDiscountedBooks(Book[] book,double discount){
        List<Book> ans = new ArrayList<>();
        for (int i = 0; i < book.length; i++) {
                book[i].price-=book[i].price*(discount/100);
                ans.add(book[i]);
            }
        return ans;
    }
}