package com.bridgelabz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.mail.MailSender;*/
import org.springframework.mail.MailSender;

import com.bridgelabz.model.Token;
import com.bridgelabz.model.User; 

public interface UserService {

	public void register(User user) throws Exception; 
	
	public void sendMail(String from, String to,String Message,String Subject) throws Exception;
	
	public boolean isActivated(int id) throws Exception;

	public User login(User user);
	

	public void resetPassword(String email,String password);

	public void saveTokenInRedis(Token token);

	public Token getToken(String token);



}
