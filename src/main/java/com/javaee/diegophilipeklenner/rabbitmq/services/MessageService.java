package com.javaee.diegophilipeklenner.rabbitmq.services;

import com.javaee.diegophilipeklenner.rabbitmq.domain.Message;

public interface MessageService {
	void sendMessage(Message message);
}