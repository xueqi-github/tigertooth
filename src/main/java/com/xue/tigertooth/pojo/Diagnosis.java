package com.xue.tigertooth.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_diagnosis")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "staff_name")
    private String staffName;

    /**
     * 患者问题
     */
    private String problem;

    /**
     * 药物名称
     */
    @Column(name = "medicine_name")
    private String medicineName;

    /**
     * 注意事项
     */
    private String notice;

    /**
     * 诊断状态（0：治疗中  1：已结束）
     */
    private Integer status;

    /**
     * 诊断日期
     */
    @Column(name = "diagnosis_date")
    private Date diagnosisDate;

    /**
     * 复查日期
     */
    @Column(name = "recheck_date")
    private Date recheckDate;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return staff_name
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * @param staffName
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * 获取患者问题
     *
     * @return problem - 患者问题
     */
    public String getProblem() {
        return problem;
    }

    /**
     * 设置患者问题
     *
     * @param problem 患者问题
     */
    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    /**
     * 获取药物名称
     *
     * @return medicine_name - 药物名称
     */
    public String getMedicineName() {
        return medicineName;
    }

    /**
     * 设置药物名称
     *
     * @param medicineName 药物名称
     */
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    /**
     * 获取注意事项
     *
     * @return notice - 注意事项
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置注意事项
     *
     * @param notice 注意事项
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * 获取诊断状态（0：治疗中  1：已结束）
     *
     * @return status - 诊断状态（0：治疗中  1：已结束）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置诊断状态（0：治疗中  1：已结束）
     *
     * @param status 诊断状态（0：治疗中  1：已结束）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取诊断日期
     *
     * @return diagnosis_date - 诊断日期
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * 设置诊断日期
     *
     * @param diagnosisDate 诊断日期
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    /**
     * 获取复查日期
     *
     * @return recheck_date - 复查日期
     */
    public Date getRecheckDate() {
        return recheckDate;
    }

    /**
     * 设置复查日期
     *
     * @param recheckDate 复查日期
     */
    public void setRecheckDate(Date recheckDate) {
        this.recheckDate = recheckDate;
    }
}