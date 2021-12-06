package com.sudarshan.behavioural.mediator;

public class ArticlesDialogBox extends DialogBox{
    private ListBox articlesListBox = new ListBox(this);
    private Button saveButton = new Button(this);
    private TextBox titleTextBox = new TextBox(this);

    public void simulateUserActions(){
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articlesListBox.setSelection("Article 2");
        System.out.println("TextBox: " +titleTextBox.getContent());
        System.out.println("Button: " +saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == articlesListBox)
            selectArticle();
        else if(uiControl == titleTextBox)
            titleChanged();
    }

    public void selectArticle(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    public void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
