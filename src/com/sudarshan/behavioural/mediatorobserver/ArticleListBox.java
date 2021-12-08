package com.sudarshan.behavioural.mediatorobserver;

public class ArticleListBox {
    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticleListBox(){
        articleListBox.addEventHandler(this::selectArticle);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserActions(){
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articleListBox.setSelection("Article 4");
        System.out.println("TextBox: " +titleTextBox.getContent());
        System.out.println("Button: " +saveButton.isEnabled());
    }

    public void selectArticle(){
        var content = articleListBox.getSelection();
        titleTextBox.setContent(content);
        saveButton.setEnabled(true);
    }

    public void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
