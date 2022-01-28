//package com.example.controller;
//
//import java.io.BufferedReader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.domain.Original;
//import com.example.repository.InsertMapper;
//import com.fasterxml.jackson.databind.MappingIterator;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
///**
// * 間違っていないが、メモリ不足のエラーが出る。javaでもinportは実質不可能
// * @author matsunagadai
// *
// */
//@RestController
//@RequestMapping("/insert")
//public class InsertController {
//
//	@Autowired
//	private InsertMapper insertMapper;
//	
//	@GetMapping("/original")
//	public void insertOriginal() {
//		CsvMapper csvMapper = new CsvMapper();
//		CsvSchema schema = csvMapper
//				.schemaFor(Original.class)
//				.withHeader() //ヘッダありの場合
//				.withColumnSeparator('\t'); //タブ区切りTSVの場合はこれでOK
//		Path path = Paths.get("/Users/matsunagadai/Downloads/train.tsv");
//        try (BufferedReader br = Files.newBufferedReader(path)) {
//            MappingIterator<Original> it = csvMapper
//            		.readerFor(Original.class)
//            		.with(schema)
//            		.readValues(br);
//            List<Original> originalList = it.readAll();
//
//            insertMapper.insertOriginal(originalList);
//        }catch (Exception e) {
//			e.printStackTrace();
//		}
//        
//	}
//}