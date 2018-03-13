import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.orilore.mappers.StudentMapper;
import com.orilore.model.Student;

public class Test {

	public static void main(String[] args) throws Exception {
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name", "Íõ");
//		map.put("sex", "ÄÐ");
//		map.put("age1", 23);
//		map.put("age2", 25);
//		map.put("begin", 10);
//		map.put("rows", 10);
		
		List<Student> students = mapper.select(map);
		for (Student student : students) {
			System.out.println(student.getXm()+"\t"+student.getXbbm()+"\t"+student.getAge());
		}
	}

}
