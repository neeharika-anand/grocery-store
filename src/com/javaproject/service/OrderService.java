package com.javaproject.service;

import java.util.List;

import com.javaproject.Model.Order;
import com.javaproject.Model.OrderDetails;
import com.javaproject.Model.Transaction;

public interface OrderService {

	public String paymentSuccess(String userName, double paidAmount);

	public boolean addOrder(Order order);

	public boolean addTransaction(Transaction transaction);

	public int countSoldItem(String prodId);

	public List<Order> getAllOrders();

	public List<Order> getOrdersByUserId(String emailId);

	public List<OrderDetails> getAllOrderDetails(String userEmailId);

	public String shipNow(String orderId, String prodId);
}
