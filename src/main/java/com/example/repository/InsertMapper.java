package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Original;

@Mapper
public interface InsertMapper {

	public void insertOriginal(@Param("originalList")List<Original> originalList);
}
