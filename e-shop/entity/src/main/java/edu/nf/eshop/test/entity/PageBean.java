package edu.nf.eshop.test.entity;

import java.util.List;

/**
 * @author 天文学
 */
public class PageBean {
    private Integer pageNum;
    private Integer pageSize;
    private Integer total;
    private Integer pageCount;
    private List<?> data;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        this.pageCount=total%pageSize==0?total/pageSize:total/pageSize+1;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
    public Integer getRow(){
        return (this.pageNum-1)*pageSize;
    }
}
