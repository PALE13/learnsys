package com.gqzdev.learnsys.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gqzdev.learnsys.dao.AdminMapper;
import com.gqzdev.learnsys.dao.CollectMapper;
import com.gqzdev.learnsys.dao.CollegeMapper;
import com.gqzdev.learnsys.dao.CourseFileMapper;
import com.gqzdev.learnsys.dao.CourseMapper;
import com.gqzdev.learnsys.dao.CourseVideoMapper;
import com.gqzdev.learnsys.dao.DiscussMapper;
import com.gqzdev.learnsys.dao.DiscussPostMapper;
import com.gqzdev.learnsys.dao.NoticeMapper;
import com.gqzdev.learnsys.dao.StudentMapper;
import com.gqzdev.learnsys.dao.StudentTaskMapper;
import com.gqzdev.learnsys.dao.TaskMapper;
import com.gqzdev.learnsys.dao.TaskQuestionMapper;
import com.gqzdev.learnsys.dao.TeacherMapper;
import com.gqzdev.learnsys.model.Admin;
import com.gqzdev.learnsys.model.Collect;
import com.gqzdev.learnsys.model.College;
import com.gqzdev.learnsys.model.Course;
import com.gqzdev.learnsys.model.CourseFile;
import com.gqzdev.learnsys.model.CourseVideo;
import com.gqzdev.learnsys.model.Discuss;
import com.gqzdev.learnsys.model.DiscussPost;
import com.gqzdev.learnsys.model.Notice;
import com.gqzdev.learnsys.model.Student;
import com.gqzdev.learnsys.model.StudentTask;
import com.gqzdev.learnsys.model.Task;
import com.gqzdev.learnsys.model.TaskQuestion;
import com.gqzdev.learnsys.model.Teacher;

@Service("index")
public class IndexService {
	@Resource
	private CollegeMapper collegeMapper;
	
	@Resource
	private StudentMapper studentMapper;
	
	@Resource
	private TeacherMapper teacherMapper;
	
	@Resource
	private CourseMapper courseMapper;
	
	@Resource
	private NoticeMapper noticeMapper;
	
	@Resource
	private CourseVideoMapper collegeVideoMapper;
	
	@Resource
	private CourseFileMapper courseFileMapper;
	
	@Resource
	private DiscussMapper discussMapper;
	
	@Resource
	private TaskMapper taskMapper;
	
	@Resource
	private TaskQuestionMapper taskQuestionMapper;
	
	@Resource
	private DiscussPostMapper discussPostMapper;
	
	@Resource
	private StudentTaskMapper studentTaskMapper;
	
	@Resource
	private AdminMapper adminMapper;
	
	@Resource 
	private CollectMapper collectMapper;
	
	public void saveCollege(College college) {
		collegeMapper.saveColege(college);
	}
	
	public void saveStudent(Student student) {
		studentMapper.saveEntity(student);
	}
	
	public List<Student> searchStudent() {
		return studentMapper.searchEntity();
	}
	
	public List<Student> searchStudentByTerm(HashMap<String, Object> map) {
		return studentMapper.searchEntityByTerm(map);
	}
	
	public void deleteStudent(Integer id) {
		studentMapper.deleteEntity(id);
	}
	
	public void updateStudent(Student student) {
		studentMapper.updateEntity(student);
	}
	
	public void updateAdmin(Admin admin) {
		adminMapper.updateEntity(admin);
	}
	
	public Student getStudentById(Integer id) {
		return studentMapper.getEntityById(id);
	}
	
	public Admin getAdminById(Integer id) {
		return adminMapper.getEntityById(id);
	}
	
	public List<College> searchCollege() {
		return collegeMapper.searchCollege();
	}
	
	public College getCollegeById(Integer id) {
		return collegeMapper.getCollegeById(id);
	}
	
	public void deleteColege(Integer id) {
		collegeMapper.deleteCollege(id);
	}
	
	public void updateColege(College college) {
		collegeMapper.updateCollege(college);
	}
	
	public void saveTeacher(Teacher teacher) {
		teacherMapper.saveEntity(teacher);
	}
	
	public List<Teacher> searchTeacher() {
		return teacherMapper.searchEntity();
	}
	
	public List<Teacher> searchTeacherByTerm(HashMap<String, Object> map) {
		return teacherMapper.searchEntityByTerm(map);
	}
	
	public void deleteTeacher(Integer id) {
		teacherMapper.deleteEntity(id);
	}
	
	public void updateTeacher(Teacher teacher) {
		teacherMapper.updateEntity(teacher);
	}
	
	public Teacher getTeacherById(Integer id) {
		return teacherMapper.getEntityById(id);
	}
	
	public void saveCourse(Course course) {
		courseMapper.saveEntity(course);
	}
	
	public List<Course> searchCourse() {
		return courseMapper.searchEntity();
	}
	
	public List<Course> searchMyCourse(Integer sId) {
		return courseMapper.searchEntityBySId(sId);
	}
	
	public List<Course> searchCourseByTerm(HashMap<String, Object> map) {
		return courseMapper.searchEntityByTerm(map);
	}
	
	public void deleteCourse(Integer id) {
		courseMapper.deleteEntity(id);
	}
	
	public void updateCourse(Course course) {
		courseMapper.updateEntity(course);
	}
	
	public Course getCourseById(Integer id) {
		return courseMapper.getEntityById(id);
	}
	
	public void saveNotice(Notice notice) {
		noticeMapper.saveEntity(notice);
	}
	
	public List<Notice> searchNotice() {
		return noticeMapper.searchEntity();
	}
	
	public void deleteNotice(Integer id) {
		noticeMapper.deleteEntity(id);
	}
	
	public void updateNotice(Notice notice) {
		noticeMapper.updateEntity(notice);
	}
	
	public Notice getNoticeById(Integer id) {
		return noticeMapper.getEntityById(id);
	}
	
	public void saveCollegeVideo(CourseVideo collegeVideo) {
		collegeVideoMapper.saveEntity(collegeVideo);
	}
	
	public List<CourseVideo> searchCollegeVideo(int id) {
		return collegeVideoMapper.searchEntity(id);
	}
	
	public List<CourseVideo> searchAllCollegeVideo() {
		return collegeVideoMapper.searchAllEntity();
	}
	
	public List<CourseFile> searchAllCollegeFile() {
		return courseFileMapper.searchAllEntity();
	}
	
	public List<CourseFile> searchCollegeFileByTerm(Integer courseId,Integer teacherId) {
		return courseFileMapper.searchEntityByTerm(courseId,teacherId);
	}
	
	public List<CourseVideo> searchCollegeVideoByTerm(Integer courseId,Integer teacherId) {
		return collegeVideoMapper.searchEntityByTerm(courseId,teacherId);
	}
	
	public CourseVideo getCourseVideoById(Integer id) {
		return collegeVideoMapper.getEntityById(id);
	}
	
	public CourseFile getCourseFileById(Integer id) {
		return courseFileMapper.searchEntityById(id);
	}
	
	public void deleteCollegeVideo(Integer id) {
		collegeVideoMapper.deleteEntity(id);
	}
	
	public void saveCollegeFile(CourseFile collegeFile) {
		courseFileMapper.saveEntity(collegeFile);
	}
	
	public List<CourseFile> searchCollegeFile(int id) {
		return courseFileMapper.searchEntity(id);
	}
	
	public void deleteCollegeFile(Integer id) {
		courseFileMapper.deleteEntity(id);
	}
	
	public void saveDiscuss(Discuss discuss) {
		discussMapper.saveEntity(discuss);
	}
	
	public List<Discuss> searchDiscuss() {
		return discussMapper.searchEntity();
	}
	
	public List<Discuss> searchDiscussByTerm(Integer courseId,Integer teacherId) {
		return discussMapper.searchEntityByTerm(courseId,teacherId);
	}
	
	public void deleteDiscuss(Integer id) {
		discussMapper.deleteEntity(id);
	}
	public void deleteDiscuss_post(Integer id){
		discussPostMapper.deleteEntity(id);
	}

	
	public void updateDiscuss(Discuss discuss) {
		discussMapper.updateEntity(discuss);
	}
	
	public Discuss getDiscussById(Integer id) {
		return discussMapper.getEntityById(id);
	}

	
	public void saveTask(Task task) {
		taskMapper.saveEntity(task);
	}
	
	public List<Task> searchTask() {
		return taskMapper.searchEntity();
	}
	
	public List<Task> searchTaskInfoByTerm(Integer courseId, Integer teacherId) {
		return taskMapper.searchEntityByTerm(courseId,teacherId);
	}
	
	public List<Task> searchTask(Integer teacherId) {
		return taskMapper.searchEntityByTeacherId(teacherId);
	}
	
	public void deleteTask(Integer id) {
		taskMapper.deleteEntity(id);
	}
	
	public void updateTask(Task task) {
		taskMapper.updateEntity(task);
	}
	
	public Task getTaskById(Integer id) {
		return taskMapper.getEntityById(id);
	}
	
	
	public void saveTaskQuestion(TaskQuestion taskQuestion) {
		taskQuestionMapper.saveEntity(taskQuestion);
	}
	
	public List<TaskQuestion> searchTaskQuestion(Integer taskId) {
		return taskQuestionMapper.searchEntity(taskId);
	}
	
	public void deleteTaskQuestion(Integer id) {
		taskQuestionMapper.deleteEntity(id);
	}
	
	public void updateTaskQuestion(TaskQuestion taskQuestion) {
		taskQuestionMapper.updateEntity(taskQuestion);
	}
	
	public TaskQuestion getTaskQuestionById(Integer id) {
		return taskQuestionMapper.getEntityById(id);
	}
	
	public void saveDiscussPost(DiscussPost discussPost) {
		discussPostMapper.saveEntity(discussPost);
	}

	public List<DiscussPost> searchDiscussPost(Integer id) {
		return discussPostMapper.searchEntity(id);
	}
	
	public void saveStudentTask(StudentTask studentTask) {
		studentTaskMapper.saveEntity(studentTask);
	}
	
	public List<StudentTask> searchStudentTask() {
		return studentTaskMapper.searchEntity();
	}
	
	public List<StudentTask> searchStudentTaskByStuId(Integer stuId) {
		return studentTaskMapper.searchEntityByStuId(stuId);
	}
	
	public Admin adminLogon(Map<String, String> map) {
		return adminMapper.searchEntityByAccount(map);
	}
	
	public Student studentLogon(Map<String, String> map) {
		return studentMapper.searchEntityByAccount(map);
	}
	
	public Teacher teacherLogon(Map<String, String> map) {
		return teacherMapper.searchEntityByAccount(map);
	}

	public void saveCollect(HashMap<String, Object> map) {
		collectMapper.saveEntity(map);
	}
	
	public List<Collect> searchCollectBySId(Integer SId) {
		return collectMapper.searchEntityBySId(SId);
	}
	
	public void deleteCollect(HashMap<String, Object> map) {
		collectMapper.deleteEntity(map);
	}

}
