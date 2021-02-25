package Exercise_2_MZ.Ex10;

public enum Gender {
    M,
    K;

    public static Gender gender (String s){
        int x = Integer.parseInt(String.valueOf(s.charAt(3)));
        if (x%2 ==0) {
            return Gender.K;
        } else {
            return Gender.M;
        }
    }
}
