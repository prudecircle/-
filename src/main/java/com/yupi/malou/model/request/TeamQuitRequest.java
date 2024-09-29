package com.yupi.malou.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author <a href="github.com/prudecircle">圈霸霸</a>
 
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

}
