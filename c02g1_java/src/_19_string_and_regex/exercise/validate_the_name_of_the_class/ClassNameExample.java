package _19_string_and_regex.exercise.validate_the_name_of_the_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX="^[CAP]+[0-9]{4}+[GHIKLM]$";
    public ClassNameExample(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
