public class ch1_binarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9};
        int item = 1;
        int result;
        ch1_binarySearch ch1BinarySearch = new ch1_binarySearch();
        result = ch1BinarySearch.binarySearch(list, item);
        System.out.println(result);
    }

    public int binarySearch(int[] list, int item){
        int low = 0; // 탐색할 범위의 최솟값
        int high = list.length - 1; // 탐색할 범위의 최댓값

        int mid; // 배열 가운데 원소 인덱스
        int guess; // 추측할 배열 내 원소
        while (low <= high) {
            mid = (low + high) / 2; // 현재 범위의 가운데 원소 인덱스
            guess = list[mid];

            if (guess == item) {
                System.out.println(item + "은 리스트의 " + (mid + 1) + "번쨰 원소입니다.");
                return mid; // 아이템을 찾으면 인덱스 반환
            }
            if (guess > item) { // 추측한 숫자가 더 크면..
                high = mid - 1; // 최댓값을 중간 이하로 바꾼다
            }
            if (guess < item) { // 추측한 숫자가 더 작으면..
                low = mid + 1; // 최솟값을 중간 이상으로 바꾼다
            }
        }
        System.out.println(item + "은 주어진 리스트에 없습니다.");
        return 0;
    }
}
