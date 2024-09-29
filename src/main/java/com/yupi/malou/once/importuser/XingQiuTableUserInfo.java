package com.yupi.malou.once.importuser;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 星球表格用户信息
 */

@Data
public class XingQiuTableUserInfo {

    /**
     * 和Excel表头形成映射
     * planetCode
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

}