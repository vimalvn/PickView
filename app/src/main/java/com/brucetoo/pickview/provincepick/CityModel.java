package com.vimalvn.pickview.provincepick;


import com.vimalvn.pickview.view.PickerItem;

/**
 * 城市信息实体类
 */
public class CityModel implements PickerItem {

	public String id; // 城市编码
	public String name; // 名称

	@Override
	public String getText() {

		return (null == name) ? "" : name;
	}

	public String toString() {

		return name + "[" + id + "]";
	}
}
