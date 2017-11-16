package com.oneinlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.oneinlet.format.json.JsonPrintFormat;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {


		List<User> userList=new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			User user=new User();
			user.setId(i);
			user.setName("我是第几"+i);
			user.setAddress("我 家住多少号"+i);
			userList.add(user);
		}

		Sprint.getInstance().print(userList);
	}


	public static void adasdadjson(){
		Sprint.getInstance(new JsonPrintFormat()).print("Hello World!");
		List<String> list = new ArrayList<String>();
		list.add("大象");
		list.add("老虎");
		Sprint.getInstance(new JsonPrintFormat()).print(list);

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "流川枫");
		map.put("movie", "灌篮高手");
		Sprint.getInstance(new JsonPrintFormat()).print(map);

		String names[] = new String[] { "樱木", "洋平" };

		Sprint.getInstance(new JsonPrintFormat()).print(names);

		App app = new App();
		App.Person p = app.new Person();
		p.id = 505;
		p.name = "五名";
		Sprint.getInstance(new JsonPrintFormat()).print(p);
	}

	public static void adadas() {
		Sprint.getInstance().print("Hello World!");
		List<String> list = new ArrayList<String>();
		list.add("大象");
		list.add("老虎");
		Sprint.getInstance().print(list);

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "流川枫");
		map.put("movie", "灌篮高手");
		Sprint.getInstance().print(map);

		String names[] = new String[] { "樱木", "洋平" };

		Sprint.getInstance().print(names);

		App app = new App();
		App.Person p = app.new Person();
		p.id = 505;
		p.name = "五名";
		Sprint.getInstance(new JsonPrintFormat()).print(p);
	}

	public class Person {
		public int id;
		public String name;
	}
}
