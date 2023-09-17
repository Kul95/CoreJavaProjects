package com.rfp.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    String authorName;
    String bookName;
    int price;

    public Book(String authorName, String bookName, int price) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Testt {
     String authorName;
     String bookName;
     int price;

    public static void main(String[] args) {
        Book b1 = new Book("Kiran Publication", "Aptitude", 300);
        Book b2 = new Book("Rd Sharma", "Mathematics", 400);
        Book b3 = new Book("CV Rammana", "Physics", 300);
        Book b4 = new Book("R Nageswar ", "Java", 350);
        Book b5 = new Book(" Saroj", "Quantam", 450);
        Book b6 = new Book(" Prakash", "C++", 350);
        Book b7 = new Book(" R J", "Quantam", 320);
        Book b8 = new Book(" John", "Python", 500);
        Book b9 = new Book(" CV Rao", "PHP", 400);
        Book b10 = new Book("Kiran ", "Aptitude", 500);

        List<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);
        List l=new ArrayList(list);
//        int sum1=0;
//        for(Object i1:l){
//           sum1=sum1+ i1.getPrice
//        }
//        System.out.println(sum1);
//
//        int sum=0;
//        for (Book i : list) {
//           if(i.price>0){
//            sum=sum+i.getPrice();
//           }
//        }
//        System.out.println("Total price:"+sum);
//

    }

}

