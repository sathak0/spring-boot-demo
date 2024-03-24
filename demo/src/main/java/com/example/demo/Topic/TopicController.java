package com.example.demo.Topic;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TopicController {
	@Autowired
	DataService obj;
	@RequestMapping("/alldata")
	public List<Data> getAllTopic(){
		return obj.getAllData();
	}
	@RequestMapping("/data/{id}")
	public Data getData(@PathVariable String id) {
		return obj.getData(id);
	}
	//@RequestMapping(method=RequestMethod.POST,value="/data/add")
	@PostMapping("/data/add")
	public void addData(@RequestBody Data data) {
		//System.out.print(data);
		obj.putData(data);
	}

}
