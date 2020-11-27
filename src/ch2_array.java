import java.util.Arrays;

public class ch2_array {
    // 주어진 정수 배열을 작은 정수 - 큰 정수 순으로 정렬하는 문제.

    int smallest; // 가장 작은 정수를 저장할 변수
    int smallest_index; // smallest의 인덱스를 저장할 변수

    static int indexNum;

    int[] arrInput = {5, 3, 6, 2, 10};
    int arrInputLength = arrInput.length;
    int[] newArr = new int[arrInputLength]; // 결과값을 넣을 새 배열.

    public static void main(String[] args) {
        ch2_array array = new ch2_array();
        int[] result = array.selectionSort(array.arrInput);
        System.out.println(Arrays.toString(result));
    }

    int findSmallest(int[] arr){ // 배열에서 가장 작은 정수 찾기
        smallest = arr[0]; // 가장 작은 정수 저장. 초기값으로 첫번째 원소 저장
        smallest_index = 0; // smallest의 인덱스 저장
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) { // 배열의 원소가 smallest보다 작으면
                smallest = arr[i]; // 그 원소가 smallest가 되고,
                smallest_index = i; // 그 원소의 인덱스가 smallest_index가 된다
                // 잘 동작하지 않는다.
                // 자바에는 .append()와 .pop()메서드가 기본제공되지 않기 때문에,
                // 최솟값을 찾아도 다음 탐색 때 그 최솟값을 빼고 나머지 값에서 탐색할 수가 없다
                // - stack패키지를 임포트하거나
                // - 현재 메서드 구조를 부수고 이중for문으로 작성해야 자바에서 선택정렬을 구현할 수 있다..
                // TODO : 어떻게든 방법을 찾아 자바에서 선택정렬 구현하기. - 구글링 또는 임포트

            }
        }
        return smallest_index;
    }

    int[] selectionSort(int[] arrInput) { // 찾은 가장 작은 정수를 새 배열에 넣기
        for(int i = 0;  i < arrInputLength; i++) {
            smallest = arrInput[findSmallest(arrInput)]; // 배열에서 가장 작은 정수를 찾기
            newArr[i] = smallest; // 가장 작은 정수를 새 배열에 추가
        }
        return newArr;
    }
}
