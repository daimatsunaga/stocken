//package com.example.insert;
//
//import java.io.BufferedReader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//import com.example.domain.Original;
//import com.fasterxml.jackson.databind.MappingIterator;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
//
//public class InsertTSV {
//
//	public static void main(String[] args) {
//				CsvMapper csvMapper = new CsvMapper();
//				CsvSchema schema = csvMapper
//						.schemaFor(Original.class)
//						.withHeader() //ヘッダありの場合
//						.withColumnSeparator('\t'); //タブ区切りTSVの場合はこれでOK
//				Path path = Paths.get("/Users/matsunagadai/Downloads/train.tsv");
//		        try (BufferedReader br = Files.newBufferedReader(path)) {
//		            MappingIterator<Original> it = csvMapper
//		            		.readerFor(Original.class)
//		            		.with(schema)
//		            		.readValues(br);
//
//		            List<Original> originalList = it.readAll();
//
//		            System.out.println(originalList.get(0));
//		        }catch (Exception e) {
//					e.printStackTrace();
//				}
//	
//	}
//
//}
