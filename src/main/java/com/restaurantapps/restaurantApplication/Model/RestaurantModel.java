package com.restaurantapps.restaurantApplication.Model;

import javax.persistence.*;
import java.util.Date;

@Entity  //This annotation will create a table in the database, by default Table Name is Class Name
@Table(name = "restaurant")
public class RestaurantModel {



        @Id
        @Column(name="orderID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        int orderID;

        public int getOrderID() {
            return orderID;
        }

        @Override
        public String toString() {
            return "RestaurantModel{" +
                    "orderID=" + orderID +
                    ", customerName='" + customerName + '\'' +
                    ", date=" + date +
                    ", billAmount=" + billAmount +
                    '}';
        }

        public void setOrderID(int orderID) {
            this.orderID = orderID;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getBillAmount() {
            return billAmount;
        }

        public void setBillAmount(int billAmount) {
            this.billAmount = billAmount;
        }

        @Column(name="customerName")
        String customerName;

        public RestaurantModel(int orderID, String customerName, Date date, int billAmount) {
            this.orderID = orderID;
            this.customerName = customerName;
            this.date = date;
            this.billAmount = billAmount;
        }

        public RestaurantModel() {
        }

        @Column(name="date")
        Date date;

        @Column(name="billAmount")
        int billAmount;

    }


