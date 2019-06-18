package com.example.dell.q_eats_orders;

public class Order {
    String restaurantName;
    String total;

    Order(String name, String age) {
        this.restaurantName = name;
        this.total = age;
        //this.photoId = photoId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}

