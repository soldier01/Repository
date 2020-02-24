/**
 * 
 */
package com.pudong.service;

import java.util.List;

import com.pudong.pojo.Pic;

public interface PicService {
	
	int addPic(Pic pic);
	
	List<Pic> show();
	
	int removeById(int id);
}
