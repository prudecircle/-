package com.yupi.malou.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author <a href="github.com/prudecircle">圈霸霸</a>
 
 */
@Data
public class PageRequest implements Serializable {

    //生成序列化id，使该对象在序列化的时候可以保持唯一
    private static final long serialVersionUID = -5860707094194210842L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;
}
