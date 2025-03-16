package com.example.hottelApp;

import com.customer.customerApp.constent.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class HottelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HottelAppApplication.class, args);
	}
	@KafkaListener(topics = AppConstants.TOPIC, groupId="group_customer_order")
	public void kafakSubscriberContent(String order) {
		System.out.print("_____________ Msg fecthed From Kafka_________________");
		System.out.println(order);

	}
}
