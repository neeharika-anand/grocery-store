package com.javaproject.utility;

import jakarta.mail.MessagingException;

public class TestMail {
	public static void main(String[] args) {
		try {
			String recipient = "neeharika.anand1@gmail.com";
			String subject = "Mail Configuration Successful";
			String htmlTextMessage = "" + "<html>"
					+ "<head><title>Java Mail Configuration Test</title><style>.greenText{color:green;} p{font-size:14;}</style></head><body>"
					+ "<h2 style='color:red;'>Welcome to Nature's Pantry</h2>" + "<p>Hey,<br>"
					+ "<br><br>Thanks for signing up with Nature's Pantry.<br>"
					+ "We are glad that you choose us. We invite you to check out our plethora of fresh and organic groceries."
					+ "<br>There is an exciting sale going on, so please visit our site and explore our products!"
					+ "<br><br> We deliver products to your house with no extra delivery charges<br><br><br>"
					+ "Have a good day!<br>" + "" + "</body>" + "</html>";
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
			System.out.println("Mail Sent Successfully!");

		} catch (MessagingException e) {
			System.out.println("Mail Sending Failed With Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
