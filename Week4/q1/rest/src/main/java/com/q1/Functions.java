package com.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.*;
import java.time.ZoneOffset;

import org.springframework.web.client.RestTemplate;

import com.q1.entity.Json_main;

public class Functions {
	
	
//	
//	String json = "https://jsonmock.hackerrank.com/api/iot_devices/search?status=Stop&page=1";
//	RestTemplate rt = new RestTemplate();
//	Json_main ret = rt.getForObject(json, Json_main.class);
//	return Arrays.asList(ret);
	
	public static long [] convert(String month) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate start_date = LocalDate.parse("01-"+month,  format);
		LocalDate end_date = start_date.withDayOfMonth(start_date.lengthOfMonth());
		LocalDateTime start = start_date.atStartOfDay();
		LocalDateTime end = end_date.atTime(23, 59, 59);
		
		long start_time = start.toInstant(ZoneOffset.UTC).toEpochMilli();
		long end_time = end.toInstant(ZoneOffset.UTC).toEpochMilli();
		long [] ret = {start_time, end_time};
		return ret;
	}
}
