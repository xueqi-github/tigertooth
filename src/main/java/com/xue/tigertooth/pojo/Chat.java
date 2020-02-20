package com.xue.tigertooth.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "staff_id")
    private Integer staffId;

    /**
     * 随访时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 随访内容
     */
    private String content;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return staff_id
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * @param staffId
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取随访时间
     *
     * @return create_time - 随访时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置随访时间
     *
     * @param createTime 随访时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取随访内容
     *
     * @return content - 随访内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置随访内容
     *
     * @param content 随访内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}