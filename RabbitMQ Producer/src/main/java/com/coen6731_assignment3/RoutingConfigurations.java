package com.coen6731_assignment3;

import org.bson.Document;

public class RoutingConfigurations {
    public String routing (Document document, String collectionName) {
        switch (collectionName) {
            case "EduCostStatQueryOne":
                return "Cost." + document.getString("Year") +"."+ document.getString("State") + "." + document.getString("Type") + "." + document.getString("Length");
            case "EduCostStatQueryTwo":
                return "Top5-Expensive." + document.getString("Year") + "." + document.getString("Type") + "." + document.getString("Length");
            case "EduCostStatQueryThree":
                return "Top5-Economical." + document.getString("Year") + "." + document.getString("Type") + "." + document.getString("Length");
            case "EduCostStatQueryFour":
                return "Top5-HighestGrow." + document.getString("YearRange") + "." + document.getString("Type") + "." + document.getString("Length");
            case "EduCostStatQueryFive":
                return "AverageExpense." + document.getString("Year") + "." + document.getString("Type") + "." + document.getString("Length");
        }
        return null;
    }
}
