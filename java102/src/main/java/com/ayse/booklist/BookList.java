package com.ayse.booklist;

import java.util.*;

/**
 * Fill, Map and Filter a list of books
 *
 * @author aysedemirel
 * @see Book
 */
public class BookList {

    private List<Book> bookList;
    private Map<String, String> mapList;

    public BookList() {
        fillList();
        mapList();
        filterList();
    }

    public static void main(String[] args) {
        new BookList();
    }

    private void fillList() {
        bookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bookList.add(
                    new Book(String.valueOf(i), 2 * 20 * i, "B", new Date(System.currentTimeMillis())));
        }
        mapList = new HashMap<>();
        bookList.forEach(System.out::println);
    }

    private void filterList() {
        System.out.println("----------------");
        List<Book> filtreli =
                bookList.stream().filter(book -> book.getPageCount() > 200).toList();
        filtreli.forEach(System.out::println);
    }

    private void mapList() {
        System.out.println("---------------");
        bookList.forEach(book -> mapList.put(book.getName(), book.getAuthorName()));
        mapList.entrySet().forEach(System.out::println);
    }
}
