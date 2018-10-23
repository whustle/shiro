package com.lz.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Test2 class
 *
 * @author wjh
 * @date 2018/10/22
 */

@Data
@Table(name = "t_user")
public class User implements Serializable {
	private static final long serialVersionUID = -5479540677959580385L;
	@Id
	@Column(name="user_id")
	private Integer id;
    @Column(name="user_name")
	private String userName;

	private String password;

	private String email;

	private String phone;

	private String salt;

	private Integer status;

	@Column(name="create_time")
	private Date createTime;
	@Column(name="update_time")
	private Date updateTime;

	/**
	 * 封装目录+菜单
	 */
	@Transient
	private List<Permission> menuList;

	/**
	 * 封装目录+菜单+按钮
	 */
	@Transient
	private List<Permission> permissionList;
}
