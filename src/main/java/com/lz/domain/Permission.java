package com.lz.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Test2 class
 *
 * @author wjh
 * @date 2018/10/22
 */

@Data
public class Permission implements Serializable {

	private static final long serialVersionUID = -5863869838815001110L;
	@Id
	@Column(name="permission_id")
	private Integer id;

	private String name;

	private Integer pid;

	private String parentName;

	private Integer type;

	private String url;

	private String code;

	private int sort;

	private String color;

	private String icon;

	@Transient
	private Boolean checked;

	@Transient
	private List<Permission> children = new ArrayList<>();

}
