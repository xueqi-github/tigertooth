package com.xue.tigertooth.pojo;

import javax.persistence.*;

@Table(name = "t_work_time")
public class WorkTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工编号
     */
    @Column(name = "staff_id")
    private Integer staffId;

    /**
     * 工作日，如：135代表星期一，星期三，星期五
     */
    @Column(name = "week_day")
    private String weekDay;

    /**
     * 上班时间
     */
    @Column(name = "start_time")
    private Integer startTime;

    /**
     * 下班时间
     */
    @Column(name = "end_time")
    private Integer endTime;

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
     * 获取员工编号
     *
     * @return staff_id - 员工编号
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 设置员工编号
     *
     * @param staffId 员工编号
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取工作日，如：135代表星期一，星期三，星期五
     *
     * @return week_day - 工作日，如：135代表星期一，星期三，星期五
     */
    public String getWeekDay() {
        return weekDay;
    }

    /**
     * 设置工作日，如：135代表星期一，星期三，星期五
     *
     * @param weekDay 工作日，如：135代表星期一，星期三，星期五
     */
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay == null ? null : weekDay.trim();
    }

    /**
     * 获取上班时间
     *
     * @return start_time - 上班时间
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * 设置上班时间
     *
     * @param startTime 上班时间
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取下班时间
     *
     * @return end_time - 下班时间
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * 设置下班时间
     *
     * @param endTime 下班时间
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}