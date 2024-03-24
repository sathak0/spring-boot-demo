package com.example.demo.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DataService {
	
	public List<Data> data=new ArrayList<Data>(Arrays.asList(
			new Data("1","Yousuf","20"),
			new Data("2","Vijay","21")
			));

	public List<Data> getAllData(){
		return data;
	}
	public Data getData(String id) {
		return data.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void putData(Data new_data) {
		data.add(new_data);
	}

}
