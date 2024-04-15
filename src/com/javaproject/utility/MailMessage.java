package com.javaproject.utility;

import jakarta.mail.MessagingException;

public class MailMessage {
	public static void registrationSuccess(String emailId, String name) {
		String recipient = emailId;
		String subject = "Registration Successful";
		String htmlTextMessage = "" + "<html>" + "<body>"
				+ "<h2 style='color:green;'>Welcome to Nature's Pantry</h2>" + "" + "Hi " + name + ","
				+ "<br><br>Thanks for signing up with Nature's Pantry.<br>"
				+ "We are glad that you choose us. We invite you to check out our plethora of fresh and organic groceries."
				+ "<br>There is an exciting sale going on, so please visit our site and explore our products!"
				+ "<br><br> We deliver products to your house with no extra delivery charges<br><br><br>"
				+ "Have a good day!<br>" + "" + "</body>" + "</html>";
		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transactionSuccess(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Order placed successfully at Nature's Pantry";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hello " + name + ",<br/><br/>"
				+ "      Thank you for shopping with Nature's Pantry!" + "      <br/><br/>"
				+ "      Your order has been placed successfully and in process to be shipped."
				+ "<br/><h6>Please Note that this is a demo project email and you have not made any real transaction with us till now!</h6>"
				+ "      <br/>" + "      Here are your Transaction Details:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Order Id:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Amount Paid:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + "</font>" + "      <br/><br/>" + "      Thanks for shopping with us!<br/><br/>"
				+ "      Please do visit us again! <br/<br/> <font style=\"color:green;font-weight:bold;\">Nature's Pantry</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void orderShipped(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Hurray!! Your Order has been shipped from Nature's Pantry";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hey " + name + ",<br/><br/>"
				+ "      Thank you for shopping with Nature's Pantry!" + "      <br/><br/>"
				+ "      Your order has been shipped successfully and on the way to be delivered."
				+ "<br/><h6>Please Note that this is a demo project email and you have not made any real transaction with us till now!</h6>"
				+ "      <br/>" + "      Here are your Transaction Details:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Order Id:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Amount Paid:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + "</font>" + "      <br/><br/>" + "      Thanks for shopping with us!<br/><br/>"
				+ "      Please do visit us again! <br/<br/> <font style=\"color:green;font-weight:bold;\">Nature's Pantry</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void productAvailableNow(String recipientEmail, String name, String prodName, String prodId) {
		String recipient = recipientEmail;
		String subject = "Product " + prodName + " is Now Available at Ellison Electronics";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hey " + name + ",<br/><br/>"
				+ "      Thank you for shopping with Nature's Pantry!" + "      <br/><br/>"
				+ "      As per your recent search history, we seen that you were searching for an item that was out of stock"
				+ " at that time. <br/><br/>"
				+ "We are glad to say that the product named <font style=\"color:green;font-weight:bold;\">" + prodName
				+ "</font> with " + "product Id <font style=\"color:green;font-weight:bold;\">" + prodId
				+ "</font> is now available in our store!"
				+ "<br/><h6>Please Note that this is a demo project email and you have not made any real transaction with us and not ordered anything till now!</h6>"
				+ "      <br/>" + "      Here are the product details which is now available:<br/>"
				+ "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Product Id: </font><font style=\"color:green;font-weight:bold;\">"
				+ prodId + " " + "      </font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Product Name: </font> <font style=\"color:green;font-weight:bold;\">"
				+ prodName + "</font>" + "      <br/><br/>" + "      Thanks for shopping with us!<br/><br/>"
				+ "      Please do visit us again! <br/<br/><br/> <font style=\"color:green;font-weight:bold;\">Nature's Pantry</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static String sendMessage(String toEmailId, String subject, String htmlTextMessage) {
		try {
			JavaMailUtil.sendMail(toEmailId, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
