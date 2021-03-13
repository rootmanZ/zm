package com.mz.cn.account.vo;

/**
 * @Description <p></p>
 * @Author: Huanglin
 * @Date: 2021/3/8 11:19
 * @Version 0.0.1
 */
public class PageVO {

    private int size = 10;
    private int current = 1;
    private int total;
    private int page;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
