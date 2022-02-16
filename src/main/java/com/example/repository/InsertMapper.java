package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Original;

@Mapper
public interface InsertMapper {

	public void insertOriginal(@Param("originalList")List<Original> originalList);
	
	public List<String> findAllOriginal();
	
	public void insertCategorySize1(@Param("parent")Integer parent, @Param("category")String category, @Param("nameAll") String nameAll);
	public void insertCategorySize2(@Param("parent")Integer parent, @Param("category")List<String> category, @Param("nameAll") String nameAll);
	public void insertCategorySize3(@Param("parent")Integer parent, @Param("category")List<String> category, @Param("nameAll") String nameAll);
	
	public Integer getMaxId();
	
	public Integer countLows();
	
	public String findById(@Param("id")Integer id);
	
	public void insertFirst(@Param("name")String name);
	
	public void insertSecond(@Param("parent")Integer parent, @Param("name")String name);
	
	public void insertThird(@Param("parent")Integer parent, @Param("name")String name, @Param("nameAll") String nameAll);
	
}
