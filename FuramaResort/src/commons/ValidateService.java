package commons;

import java.util.Calendar;

public class ValidateService {
    public static boolean checkIDVilla(String id) {
        String idRegex = "(SVVL)-[0-9]{4}";
        return id.matches(idRegex);
    }

    public static boolean checkIDHouse(String id) {
        String idRegex = "(SVHO)-[0-9]{4}";
        return id.matches(idRegex);
    }

    public static boolean checkIDRoom(String id) {
        String idRegex = "(SVRO)-[0-9]{4}";
        return id.matches(idRegex);
    }

    public static boolean checkNameService(String name) {
        String nameRegex = "^[A-Z]{1}[a-z]{1,}$";
        return name.matches(nameRegex);
    }

    public static boolean checkArea(Double area) {
        if (!area.isNaN() && area > 30) {
            return true;
        }
        return false;
    }

    public static boolean checkAmount(int amount) {
        if (amount > 0 && amount < 20) {
            return true;
        } else return false;
    }

    public static boolean checkCost(int cost) {
        if (cost > 0) {
            return true;
        }
        return false;
    }

    public static boolean checkOtherRoom(String other) {
        String otherRegex = "(massage|karaoke|food|drink|car)";
        if (other.matches(otherRegex)) {
            return true;
        }
        return false;
    }

    public static boolean checkNumberOfFloor(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }

    public static boolean checkDay(String day) {
        String dayRegex =
                "^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
        if (day.matches(dayRegex)) {
            if ((Integer.parseInt(day.substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)) {
                return true;
            }
        }
        return false;
    }
}
