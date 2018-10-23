package com.lz.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Test2 class
 *
 * @author wjh
 * @date 2018/10/22
 */

@Data
public class Role implements Serializable {

	private static final long serialVersionUID = -5514193267042043879L;
	@Id
	@Column(name="role_id")
	private Integer id;

	private String name;

	private String descr;

	@Transient
	private Boolean selected;
}
