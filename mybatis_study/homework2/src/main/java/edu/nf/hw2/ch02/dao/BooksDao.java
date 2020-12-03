package edu.nf.hw2.ch02.dao;

import edu.nf.hw2.ch02.entity.Books;

/**
 * @author 天文学
 */
public interface BooksDao {

    /**
     * 添加图书
     * @param books
     */
    void save(Books books);

    /**
     * 修改图书
     * @param books
     */
    void update(Books books);

    /**
     * 删除图书
     * @param id
     */
    void delete(int id);
}
