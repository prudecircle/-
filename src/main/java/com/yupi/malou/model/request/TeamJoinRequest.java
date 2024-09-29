package com.yupi.malou.model.request;

// 本项目_所属 [圈霸霸](github.com/prudecircle)

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author <a href="github.com/prudecircle">圈霸霸</a>
 
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
