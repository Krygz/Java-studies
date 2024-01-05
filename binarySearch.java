
public class binarySearch {
	public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
		          18, 19, 20}; 
		
	binarySearch bin = new binarySearch(); 
		 bin.searchNumbers(67 , numbers);
		 bin.searchNumbers(876 , numbers);	 
	}
		 public void searchNumbers(int x , int [] numbers){
        int begin = 0;
        int mid = 0;
        int end = numbers.length - 1;

            while(begin <= end) {
            mid = (end + begin) / 2;
            System.out.println("begin: " + numbers[begin] + " mid : " + numbers[mid] + " end: " + numbers[end]);
            System.out.println("begin : " + begin + " mid : " + mid + " end " + end);

            if (numbers[mid] == x) {
                System.out.println("the number is : " + x);
                break;
          }
            if (numbers[mid] < x) {
                begin = mid + 1;

          } else {
                end = mid - 1;
          }
          }
        if(begin > end){
            System.out.println("number not found " + x);
        }
    }
}
