package com.example.msgapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.msg.EmailService;
import com.example.msg.MessageProcessor;
import com.example.msg.MessageService;
import com.example.msg.MsgProcessImp;
import com.example.msg.SMSService;

@SpringBootApplication
public class MessageSystemApplication {
	
	@Bean("emailservice")
	public MessageService emailservice() {
	return new EmailService();
	}
	@Bean("smsservice")
	public MessageService smsservice() {
	return new SMSService();
	}
	@Bean("messageprocessor")
	public MessageProcessor messageprocesor() {
	return new MsgProcessImp(smsservice());
	}

	public static void main(String[] args) {
		MessageProcessor mp = SpringApplication.run(MessageSystemApplication.class, args).getBean(MessageProcessor.class);
		mp.processMsg();
	}

}
