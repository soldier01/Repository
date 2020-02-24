/**
 * 
 */
package com.pudong.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pudong.mapper.PicMapper;
import com.pudong.pojo.Pic;
@Service
public class PicServiceImpl implements PicService {

	@Resource
	private PicMapper picMapper;
	@Override
	public int addPic(Pic pic) {

		return picMapper.insertPic(pic);
	}
	@Override
	public List<Pic> show() {
		
		return picMapper.selectPics();
	}
	@Override
	public int removeById(int id) {
		
		return picMapper.delete(id);
	}

}
