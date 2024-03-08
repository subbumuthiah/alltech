package com.q1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.q1.Functions;
import com.q1.entity.Device;
import com.q1.entity.Inp;
import com.q1.entity.Json_main;

import jakarta.persistence.Convert;

@RestController
public class APIController {

	@RequestMapping("/hello")
	public String test() {
		return "Hello";
	}
	
	//********************
//pass "statusQuery", "dateStr", "threshold" in json request body to get output
	//********************
	@GetMapping("/external")
	public int numDevices(@RequestBody Inp inp) {
		String json_start = "https://jsonmock.hackerrank.com/api/iot_devices/search?status=";
		String cat = json_start.concat(inp.getStatusQuery());
		String json_middle = "&page=";
		String cat1 = cat.concat(json_middle);
		String cat2 = cat1.concat("1");
		boolean flag = false;
		RestTemplate rt = new RestTemplate();
		int till = rt.getForObject(cat2, Json_main.class).getTotal_pages();
		int curr_page = 1;
		long[] range = Functions.convert(inp.getDateStr());
		int count = 0;
		for (int j = 1; j <= till; j++) {

			String temp = cat1.concat(Integer.toString(curr_page));
			System.out.println(temp);
			Json_main ret = rt.getForObject(temp, Json_main.class);
			Device[] dev_array = ret.getData();

			for (int i = 0; i < dev_array.length; i++) {
				if (dev_array[i].getTimestamp() >= range[0] && dev_array[i].getTimestamp() <= range[1]) {
					if (dev_array[i].getOperatingParams().getRootThreshold() > inp.threshold) {
						if (dev_array[i].getStatus().toLowerCase().contains(inp.getStatusQuery().toLowerCase())) {
							count++;
						}
					}
				}
			}

			curr_page++;

		}

		return count;
	}
}
