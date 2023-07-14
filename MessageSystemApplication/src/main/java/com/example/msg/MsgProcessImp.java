package com.example.msg;

import org.springframework.beans.factory.annotation.Qualifier;

public class MsgProcessImp implements MessageProcessor{ 
	
	public MessageService mservice; 

	public MsgProcessImp(@Qualifier("smsservice") MessageService mservice) {

		super(); 

		this.mservice = mservice; 

	} 

	public void processMsg() {

		mservice.sendMsg();

	}

}
