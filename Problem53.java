class LibraryItem {
    int itemID = 1;
    String title = "The Book of Greatness";
    String author = "Rajesh Ranjan";

    public void checkout() {
        System.out.println("This is parent's checkout method.");
    }

    public void returnItem() {
        System.out.println("This is parent's returnItem method.");
    }
}

class Book extends LibraryItem {
    int isbn = 1001;
}

class Magazine extends LibraryItem {
    int issueNumber = 6545;
}

class DVD extends LibraryItem {
    int duration = 230;
}

public class Problem53 {
    public static void main(String[] args) {
        Book b = new Book();
        Magazine m = new Magazine();
        DVD d = new DVD();

        System.out.println("book.author : " + b.author);
        System.out.println("book.isbn : " + b.isbn);
        System.out.println("book.itemID : " + b.itemID);
        System.out.println("book.title : " + b.title);

        System.out.println("magazine.author : " + m.author);
        System.out.println("magazine.issueNumber : " + m.issueNumber);
        System.out.println("magazine.itemID : " + m.itemID);
        System.out.println("magazine.title : " + m.title);

        System.out.println("dvd.author : " + d.author);
        System.out.println("dvd.duration : " + d.duration);
        System.out.println("dvd.itemID : " + d.itemID);
        System.out.println("dvd.title : " + d.title);

        System.out.print("checkout method through book. : ");
        b.checkout();
        System.out.print("checkout method through book. : ");
        b.returnItem();
        System.out.print("checkout method through magazine. : ");
        m.checkout();
        System.out.print("checkout method through magazine. : ");
        m.returnItem();
        System.out.print("checkout method through dvd. : ");
        d.checkout();
        System.out.print("checkout method through dvd. : ");
        d.returnItem();
    }
}
