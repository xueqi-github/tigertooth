package com.xue.tigertooth.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nick_name")
    private String nickName;

    private String name;

    private Integer sex;

    private Integer age;

    private String password;

    private Integer phone;

    private String address;

    /**
     * 个人简历地址
     */
    @Column(name = "introduce_url")
    private String introduceUrl;

    private String email;

    /**
     * 角色类型：1代表普通员工
     */
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "reg_time")
    private Date regTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取个人简历地址
     *
     * @return introduce_url - 个人简历地址
     */
    public String getIntroduceUrl() {
        return introduceUrl;
    }

    /**
     * 设置个人简历地址
     *
     * @param introduceUrl 个人简历地址
     */
    public void setIntroduceUrl(String introduceUrl) {
        this.introduceUrl = introduceUrl == null ? null : introduceUrl.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取角色类型：1代表普通员工
     *
     * @return role_id - 角色类型：1代表普通员工
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色类型：1代表普通员工
     *
     * @param roleId 角色类型：1代表普通员工
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return reg_time
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * @param regTime
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}