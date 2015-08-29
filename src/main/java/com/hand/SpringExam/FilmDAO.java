package com.hand.SpringExam;

import javax.sql.DataSource;

public interface FilmDAO {
	
	public void setDataSource(DataSource ds);
	public void create(String title,String description, Integer language_id);
}
