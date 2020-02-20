package com.xue.tigertooth.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 客户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 员工id
     */
    @Column(name = "staff_id")
    private Integer staffId;

    /**
     * 预约时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 预约状态（0：排队中，1：成功  ，2：失败）
     */
    private Integer status;

    /**
     * 0:没有赴约，1：赴约
     */
    @Column(name = "is_come")
    private Integer isCome;

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
     * 获取客户id
     *
     * @return user_id - 客户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置客户id
     *
     * @param userId 客户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取员工id
     *
     * @return staff_id - 员工id
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 设置员工id
     *
     * @param staffId 员工id
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取预约时间
     *
     * @return order_time - 预约时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置预约时间
     *
     * @param orderTime 预约时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取预约状态（0：排队中，1：成功  ，2：失败）
     *
     * @return status - 预约状态（0：排队中，1：成功  ，2：失败）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置预约状态（0：排队中，1：成功  ，2：失败）
     *
     * @param status 预约状态（0：排队中，1：成功  ，2：失败）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取0:没有赴约，1：赴约
     *
     * @return is_come - 0:没有赴约，1：赴约
     */
    public Integer getIsCome() {
        return isCome;
    }

    /**
     * 设置0:没有赴约，1：赴约
     *
     * @param isCome 0:没有赴约，1：赴约
     */
    public void setIsCome(Integer isCome) {
        this.isCome = isCome;
    }
}