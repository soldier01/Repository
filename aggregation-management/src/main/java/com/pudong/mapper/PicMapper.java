/**
 * 
 */
package com.pudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.pudong.pojo.Pic;

public interface PicMapper {
	
	int insertPic(Pic pic);
	
	@Select("select * from pic")
	List<Pic> selectPics();
	
	@Delete("delete from pic where id=#{0}")
	int delete(int id);
}
