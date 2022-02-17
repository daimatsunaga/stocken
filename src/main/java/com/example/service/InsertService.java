package com.example.service;




import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.repository.InsertMapper;

@Service
public class InsertService {
	
	@Autowired
	private InsertMapper insertMapper;
	
	public void insertCategoryTable() {
				
		for(int i = 0; i <= insertMapper.countLows(); i++) {
			String categoryAll = insertMapper.findById(i);
			
			if(Objects.isNull(categoryAll) || categoryAll.isEmpty()) {
				continue;
			}
			
			List<String> categoryList = Arrays.asList(insertMapper.findById(i).split("/"));
			

			if(categoryList.size() == 1) {
				insertMapper.insertCategorySize1(null, categoryAll, categoryAll);
			}
			
			if(categoryList.size() == 2) {
				Integer parent = insertMapper.getMaxId();
				insertMapper.insertCategorySize2(parent, categoryList, categoryAll);
				
			}
			
			if(categoryList.size() == 3) {
				Integer parent = insertMapper.getMaxId();
				insertMapper.insertCategorySize3(parent, categoryList, categoryAll);
			}
			
			if(categoryList.size() >= 4) {
				String nameAll = categoryList.get(0) + "/" + categoryList.get(1) + "/" + categoryList.get(2);
				Integer parent = insertMapper.getMaxId();
				insertMapper.insertCategorySize3(parent, categoryList, nameAll);	
			}

		}
	}
	
}
