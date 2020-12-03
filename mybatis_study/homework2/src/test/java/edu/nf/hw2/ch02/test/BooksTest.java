package edu.nf.hw2.ch02.test;

import edu.nf.hw2.ch02.dao.BooksDao;
import edu.nf.hw2.ch02.dao.impl.BooksDaoImpl;
import edu.nf.hw2.ch02.entity.Books;
import org.junit.Test;

public class BooksTest {

    @Test
    public void testSave(){
        BooksDao dao=new BooksDaoImpl();
        dao.save(getbook());
    }
    @Test
    public void testUpdate(){
        BooksDao dao=new BooksDaoImpl();
        dao.update(getbook());
    }
    @Test
    public void testDelete(){
        BooksDao dao=new BooksDaoImpl();
        dao.delete(1000);
    }

    private Books getbook(){
        return new Books(1000,"时间简史","霍金",100.00);
    }
}
