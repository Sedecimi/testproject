package com.epam.testproject.controllers;

import com.epam.testproject.dao.StudentsDAO;
import com.epam.testproject.entities.StudentsEntity;
import com.epam.testproject.forms.ActionFormImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class ActionFormController extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Get all students with zero grunts
        StudentsDAO studentsDAO = new StudentsDAO();
        List<StudentsEntity> studentsEntities = studentsDAO.getAllZeroGrunts();
        Iterator<StudentsEntity> studentsEntityIterator = studentsEntities.iterator();

        response.setContentType("application/jaon");
        PrintWriter out = response.getWriter();

        //Produce json
        while (studentsEntityIterator.hasNext()){
            StudentsEntity entity = studentsEntityIterator.next();
            JSONObject json = new JSONObject();
            json.put("email", entity.getEmail());
            json.put("name", entity.getName());
            json.put("cash", entity.getGrunt().getCash());
            out.println(json);
        }

        out.flush();

        return null;
    }
}
