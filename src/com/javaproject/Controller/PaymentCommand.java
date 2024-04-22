package com.javaproject.Controller;

import com.javaproject.service.impl.OrderServiceImpl;

public class PaymentCommand extends OrderCommand {
    private String userName;
    private double paidAmount;

    public PaymentCommand(String userName, double paidAmount) {
        this.userName = userName;
        this.paidAmount = paidAmount;
    }

    @Override
    public String execute() {
        OrderServiceImpl orderService = new OrderServiceImpl();
        return orderService.paymentSuccess(userName, paidAmount);
    }
}
