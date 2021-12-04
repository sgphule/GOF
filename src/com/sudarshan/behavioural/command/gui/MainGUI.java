package com.sudarshan.behavioural.command.gui;

import com.sudarshan.behavioural.command.fx.Button;

public class MainGUI {
    public static void main(String[] args){
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
