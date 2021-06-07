package variable;

import java.text.NumberFormat;

public class Test {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();

        numberFormat.setGroupingUsed(false);

        String  secondAmount = "2.114778163349455E15";
        long a = Long.valueOf(secondAmount).longValue();
//        String str = numberFormat.format(secondAmount);
//        System.out.println("str:="+str);
//        long a= scienceToLong(secondAmount);
        System.out.println("a:="+a);
    }
    /**
     * 科学计数法形式字符串转Long
     * @param str
     * @return
     */
    public static Long scienceToLong(String str){
        str = str.replaceAll(",", "");
        Long aLong = Long.parseLong(str);
        return aLong;
    }
}
