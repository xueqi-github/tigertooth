package com.xue.tigertooth.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_complaint")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_name")
    private String userName;

    private String content;

    /**
     * 投诉日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 0:服务态度 1：服务质量  2：服务环境
     */
    private Integer type;

    /**
     * 状态（0：未查看  1：已受理）
     */
    private Integer status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_name - 用户id
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户id
     *
     * @param userName 用户id
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取投诉日期
     *
     * @return create_time - 投诉日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置投诉日期
     *
     * @param createTime 投诉日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取0:服务态度 1：服务质量  2：服务环境
     *
     * @return type - 0:服务态度 1：服务质量  2：服务环境
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置0:服务态度 1：服务质量  2：服务环境
     *
     * @param type 0:服务态度 1：服务质量  2：服务环境
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态（0：未查看  1：已受理）
     *
     * @return status - 状态（0：未查看  1：已受理）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0：未查看  1：已受理）
     *
     * @param status 状态（0：未查看  1：已受理）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}