package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {

		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		Youtuber obj2=obj;
		obj2.editVideo();
		obj2.makeVideo();
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making a video");

	}

	@Override
	public void study() {
		System.out.println("person is studing");

	}

	@Override
	public void editVideo() {
		System.out.println("youtuber is editing");
		
	}

}


//int c[] = new int[n];
//Arrays.fill(c, 1);
//
//for (int i=1; i<n ; i++){
//    if(a[i]>a[i-1]){
//        c[i]= c[i-1] + 1;
//    }
//}
//
//for (int i=n-2; i<=0 ; i--){
//    if(a[i]>a[i+1]){
//        c[i]= Math.max(c[i+1] + 1,c[i]);
//    }
//}
//
//long sum=0;
//for (int i=0; i<n; i++){
//    sum = sum + (long)c[i];
//}
//
//return sum;
