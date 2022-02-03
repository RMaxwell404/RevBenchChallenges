package Java;

import java.util.HashSet;

public class JavaSolutions {

    public boolean isPronic(double i){
        if(i != 2 && i % 2 != 0){
            return false;
        }
        else{
            double i2 = Math.sqrt(i);
            if ((i2 * (i2+1) == i )){
                return true;
            }
            else return false;
        }
    }


    public boolean isHappy(Integer i){

        HashSet<Integer> iSet = new HashSet<>();
        while (true){
            int sum = 0;
            while (i != 0){
                sum += (i%10)*(i%10);
                i /= 10;
            }
            if (i == 1) return true;
            if (iSet.contains(i)) return false;
            iSet.add(i);
        }
    }
}
