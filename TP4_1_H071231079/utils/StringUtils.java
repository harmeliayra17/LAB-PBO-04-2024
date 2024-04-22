package utils;

public class StringUtils {
    public static String generateNickname(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length > 1) {
            return parts[1]; 
        }
        return fullName; 
    }
}
