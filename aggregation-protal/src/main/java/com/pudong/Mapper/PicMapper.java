/**
 * 
 */
package com.pudong.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pudong.pojo.Pic;

public interface PicMapper {

	@Select("select * from pic")
	List<Pic> selectAll();
}
