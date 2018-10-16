package org.zerock.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private DataSource ds;
	
	@Test
	public void tes1() {
		log.info("test1...."); // root-context.xml 제대로 호출되는지 확인
		
	}
	@Test
	public void testConnection() throws SQLException{
		log.info("이거시다 : " + ds.getConnection());
	}
}
