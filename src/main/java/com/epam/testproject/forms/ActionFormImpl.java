package com.epam.testproject.forms;

import org.apache.struts.action.ActionForm;

public class ActionFormImpl extends ActionForm {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
