package com.xue.tigertooth.pojo;

import javax.persistence.*;

@Table(name = "t_appraise")
public class Appraise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 已受理订单的id
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 态度分（1-10）
     */
    @Column(name = "attitude_score")
    private Integer attitudeScore;

    /**
     * 专业力（1-10）
     */
    @Column(name = "quality_sorce")
    private Integer qualitySorce;

    @Column(name = "environment_sorce")
    private Integer environmentSorce;

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
     * 获取已受理订单的id
     *
     * @return order_id - 已受理订单的id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置已受理订单的id
     *
     * @param orderId 已受理订单的id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取态度分（1-10）
     *
     * @return attitude_score - 态度分（1-10）
     */
    public Integer getAttitudeScore() {
        return attitudeScore;
    }

    /**
     * 设置态度分（1-10）
     *
     * @param attitudeScore 态度分（1-10）
     */
    public void setAttitudeScore(Integer attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    /**
     * 获取专业力（1-10）
     *
     * @return quality_sorce - 专业力（1-10）
     */
    public Integer getQualitySorce() {
        return qualitySorce;
    }

    /**
     * 设置专业力（1-10）
     *
     * @param qualitySorce 专业力（1-10）
     */
    public void setQualitySorce(Integer qualitySorce) {
        this.qualitySorce = qualitySorce;
    }

    /**
     * @return environment_sorce
     */
    public Integer getEnvironmentSorce() {
        return environmentSorce;
    }

    /**
     * @param environmentSorce
     */
    public void setEnvironmentSorce(Integer environmentSorce) {
        this.environmentSorce = environmentSorce;
    }
}