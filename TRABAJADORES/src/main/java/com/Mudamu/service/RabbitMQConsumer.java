package com.Mudamu.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${mudamu.medico.rabbitmq.queue}")
	public void recievedMessage(Object employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}

	@RabbitListener(queues = "${mudamu.citas.rabbitmq.queue}")
	public void recievedMessageCitas(Object employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}