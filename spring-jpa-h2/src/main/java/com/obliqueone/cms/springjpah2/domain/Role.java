package com.obliqueone.cms.springjpah2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	private long id;
	private String roleName;
	private String roleCd;
	private String roleDesc;
	private boolean enabled;
}
