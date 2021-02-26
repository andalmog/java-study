package algorithm;

// 이진 검색 구현 binary search
// 출처 : https://ko.khanacademy.org/computing/computer-science/algorithms/binary-search/pc/challenge-binary-search
public class BinarySearch {
	/* pseudo-code
	1. min = 0 이고 max = n-1 입니다.
	2.max < min, 이라면 멈춥니다. 타겟이 배열에 존재하지 않습니다. -1을 반환합니다.
	3. 'guess'를 'max'와 'min'의 평균으로 계산하고 (정수가 될 수 있도록) 내림합니다.
	4. 배열[guess]가 타겟과 같다면 멈춥니다. 찾았습니다! guess를 반환합니다.
	5. 만약 추측이 너무 낮았다면, 즉 배열[guess] < 타켓이라면, min = guess + 1로 바꿉니다.
	6. 그렇지 않다면 추측이 너무 높습니다. max = guess - 1로 바꿉니다.
	7. 2단계로 돌아갑니다.
	*/
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int target = 71;
		
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.solve(arr, target));
	}
	
	public int solve(int[] arr, int target) {
		int min = 0;
		int max = arr[arr.length - 1];
		int guess = -1;
		
		while(true) {
			guess = Math.floorDiv(min+max, 2);
			if(max < min) {
				guess = -1;
				break;
			}else {
				if(guess < target) {
					min = guess + 1;
				}else if(guess > target) {
					max = guess -1;
				}else if(guess == target) {
					break;
				}
			}	
		}
		
		return guess;
	}

}
