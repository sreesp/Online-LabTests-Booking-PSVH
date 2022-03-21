package com.psvh.db.pojo;

import com.psvh.db.doa.UserDAO;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Shravan", "shravi@gmail.com", 999999L, "password", 9, "theda", "puli");
		User user2 = new User("Vamshi", "vamtri@gmail.com", 99999L, "password", 9, "male", "patel");
		UserDAO dao = new UserDAO();
		
		String msg = dao.insert(user1);
		String msg2 = dao.insert(user2);

	}

}
