package com.mastery.java.task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
//    @GeneratedValue(generator = "uuid-generator")
//    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private Long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "gender")
    private Gender gender;
}
