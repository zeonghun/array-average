/**
 * @ 배열의 평균을 구하는 메소드
 * 
 * @param arr 평균을 구할 배열
 * 
 * @author zeonghun
 * @since 230313
 */
public class ArrAvg {
    public void avg(int[] arr) {
        double answer = 0; // 배열의 평균값
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / arr.length; // 평균 = 배열총합 / 배열길이
        System.out.println("평균은: " + answer);
    }
}