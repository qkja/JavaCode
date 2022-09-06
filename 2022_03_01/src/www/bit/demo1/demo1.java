package www.bit.demo1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-01
 * Time: 9:35
 */

// class A<T> {
//    T value;
//
//    A(T value) {
//       this.value = value;
//    }
//
//    T get() {
//        return value;
//    }
//}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {-7,57,-76,5,51,-57,27,83,68,39,-38,43,-79,42,-79,72,-58,-29,-34,23,20,-67,-67,74,10,-90,-91,41,22,-12,-75,-3,51,13,9,58,72,-3,48,-28,78,15,13,22,-68,62,33,-18,21,-2,56,41,27,-33,-35,-36,-6,-73,-9,-45,-16,4,51,-54,-92,79,-92,-12,-9,39,1,-60,78,16,-77,-45,26,-43,44,-21,-27,74,-68,-58,22,52,100,37,48,99,98,-34,36,25,-85,83,99,-64,-37,20,0,13,85,18,98,-91,86,-94,-92,-42,-82,89,67,-13,43,11,75,67,-38,-79,-3,-24,83,-1,74,-93,26,-69,92,40,-32,-89,-100,-36,80,9,92,79,-83,90,-8,-77,1,-60,100,63,87,-51,-33,17,24,-73,-81,-86,52,59,10,-84,-71,-12,24,-53,-14,-44,-48,-91,-57,-82,-5,48,-56,-92,83,-64,-17,-46,65,-15,87,-61,-29,79,-53,-81,-58,70,70,-12,-71,68,-57,-44,-18,-94,-84,7,-51,18,44,96,24,8,61,36,-83,-93,38,82,25,4,37,93,-5,24,-9,-31,15,-73,-91,-36,41,56,-17,3,-94,-26,96,5,-21,-20,60,-53,26,2,-97,41,-72,-29,-83,32,35,-29,82,-38,-15,81,-10,50,22,26,30,-31,74,-74,47,66,53,35,-58,-68,47,-21,78,12,-88,1,12,53,94,1,-43,-36,67,6,-89,44,-86,-22,48,-12,72,-90,-7,-92,30,-17};
        System.out.println(solution.canThreePartsEqualSum(arr));
    }
    public static int func(int[][] arr) {
        return arr.length;
    }
    public static void main2(String[] args) {
        int[][] arr = new int[12][3];
        func(arr);
        System.out.println( func(arr));

    }
    public static void main1(String[] args) {
        List<Employee> list = new LinkedList<>();

    }
//    public static void main(String[] args) {
//        A<String> a = new A<>("qkj");
//        System.out.println(a.get());
//    }
}

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int num: A) {
            sum += num;
        }
        // 数组A的和如果不能被3整除直接返回false
        if (sum % 3 != 0) {
            return false;
        }
        // 遍历数组累加，每累加到目标值cnt加1，表示又找到1段
        sum /= 3;
        int curSum = 0, cnt = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                curSum = 0;
            }
        }
        // 最后判断是否找到了3段（注意如果目标值是0的话可以大于3段）
        return cnt == 3 || (cnt > 3 && sum == 0);
    }
}


//class Solution {
//    public int help(List<Employee> employees,Employee e) {
//        int count = 0;
//        if(e.subordinates.isEmpty()) {
//            return e.importance;
//        } else {
//            for(int i=0;i<e.subordinates.size();i++) {
//                int id = e.subordinates.get(i);
//                count += help(employees,getEmployee(employees,id));
//            }
//            return e.importance + count;
//        }
//    }
//    public Employee getEmployee(List<Employee> employees, int id) {
//        if(employees.isEmpty()) {
//            return null;
//        }
//        for (int i = 0; i < employees.size(); i++) {
//            Employee employee = employees.get(i);
//            if(employee.id==id) {
//               return employee;
//            }
//        }
//        return null;
//    }
//
//    public int getImportance(List<Employee> employees, int id) {
//        if(employees.isEmpty()) {
//            return -1;
//        }
//
//        Employee employee = getEmployee(employees,id);
//        if(employee==null) {
//            return -1;
//        }
//
//        int count = help(employees,employee);
//        return count;
//    }
//}
