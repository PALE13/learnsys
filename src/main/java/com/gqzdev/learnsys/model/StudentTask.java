package com.gqzdev.learnsys.model;

import java.util.Date;

public class StudentTask {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_task.id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_task.student_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_task.task_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    private Integer taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_task.score
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    private Integer score;
    
    private String taskName;
    
    private String studentName;
    
    public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_task.record_time
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_task.id
     *
     * @return the value of student_task.id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public Integer getId() {
        return id;
    }
    
    

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_task.id
     *
     * @param id the value for student_task.id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_task.student_id
     *
     * @return the value of student_task.student_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_task.student_id
     *
     * @param studentId the value for student_task.student_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_task.task_id
     *
     * @return the value of student_task.task_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_task.task_id
     *
     * @param taskId the value for student_task.task_id
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_task.score
     *
     * @return the value of student_task.score
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_task.score
     *
     * @param score the value for student_task.score
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_task.record_time
     *
     * @return the value of student_task.record_time
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_task.record_time
     *
     * @param recordTime the value for student_task.record_time
     *
     * @mbg.generated Sat Mar 31 20:18:35 CST 2018
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}