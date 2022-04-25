package _19_string_and_regex.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER_NAME_REGEX ="^[(]+[0-9]{2}+[)]+[-]+[(]+[0][0-9]{9}+[)]$";
    public PhoneNumberExample(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUMBER_NAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
