package edu.nf.test.entity;

import java.util.List;

/**
 * @author 天文学
 */
public class PageBean {
    /**
     * 当前页
     */
    private Integer pageNum;
    /**
     * 每页显示条数
     */
    private Integer pageSize;
    /**
     * 总记录数
     */
    private Integer total;
    /**
     * 总页数
     */
    private Integer pageCount;
    /**
     * 分页数据
     */
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

    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * 设置总记录数时计算出总页数
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
        //根据总记录数计算总页数
        this.pageCount = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
    }

    public Integer getTotal() {
        return total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    /**
     * 根据页码计算从第几条记录开始查询
     * @return
     */
    public int getRowNum(){
        return (pageNum - 1) * pageSize;
    }
}
