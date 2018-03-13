package com.orilore.mappers;
import java.util.List;
import java.util.Map;

import com.orilore.model.*;
public interface StudentMapper{
	public void insert(Student bean);
	public Student selectOne(int sid);
	public void delete(int sid);
	public List<Student> select(Map<String,Object> map);
	public void update(Student bean);
}