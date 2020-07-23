package com.google.step;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-location")
public class AddLocation extends HttpServlet {
    private final String PROJECT_ID = System.getenv("PROJECT_ID");

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // Get form parameters.
        String formLatitude = request.getParameter("latitude");
        String formLongitude = request.getParameter("longitude");
        String formLocationName = request.getParameter("locationName");

        // See if form was filled out
        if(!isFormEmpty(formLatitude, formLongitude, formLocationName)) {
            // TODO: A new "TrackedLocation" entity should be added as well.
        }
    }

    /** Helper function to check for empty values from form. **/
    private Boolean isFormEmpty(String formLatitude, String formLongitude, String formLocationName) {
        return (formLatitude.equals("") && 
                formLongitude.equals("") &&
                formLocationName.equals(""));
    }
}
