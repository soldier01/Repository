/**
 * 
 */
package com.pudong.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pudong.Mapper.PicMapper;
import com.pudong.pojo.Pic;
@Service
public class PicServiceImpl implements PicService {

	@Value("${magageurl}")
	private String path;
	@Resource
	private PicMapper picMapper;
	@Override
	public List<Pic> show() {
		List<Pic> list = picMapper.selectAll();
		for (Pic pic : list) {
			pic.setPath(path + pic.getPath());
		}
		return list;
	}

	
}
