package com.asprsys.sbet.bootingweb.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asprsys.sbet.bootingweb.db.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
