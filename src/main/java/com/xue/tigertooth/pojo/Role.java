package com.xue.tigertooth.pojo;

import javax.persistence.*;

@Table(name = "t_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色Id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 角色名字
     */
    @Column(name = "role_name")
    private String roleName;

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
     * 获取角色Id
     *
     * @return role_id - 角色Id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色Id
     *
     * @param roleId 角色Id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名字
     *
     * @return role_name - 角色名字
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名字
     *
     * @param roleName 角色名字
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}