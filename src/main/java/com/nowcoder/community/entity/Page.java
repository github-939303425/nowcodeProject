package com.nowcoder.community.entity;

/**
 * 封装分页相关的信息
 * @author dps
 * @create 2022-03-26-17:55
 */
public class Page {

    // 当前页码
    private int current = 1;
    // 显示上限
    private int limit = 10;
    // 数据的总数(用于计算总页数)
    private int rows;
    // 查询路径(用于复用分页链接)
    private String path;
    // 数据的总页数
    private int total;
    //起始页
    private int from;
    //末页
    private int to;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     */
    public int getOffset(){
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     */
    public int getTotal(){
        if(rows % limit == 0){
            return rows / limit;
        }else {
            //如果除不尽,就+1
            return rows / limit + 1;
        }
    }

    /**
     * 获取起始页码
     */
    public int getFrom(){
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取结束页码
     */
    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }

}
