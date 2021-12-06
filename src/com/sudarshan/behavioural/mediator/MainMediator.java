package com.sudarshan.behavioural.mediator;

public class MainMediator {
    public static void main(String[] args){
        var articleListBox = new ArticlesDialogBox();
        articleListBox.simulateUserActions();
    }
}
