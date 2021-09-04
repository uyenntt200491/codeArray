package Array1;

public class Array1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] array1 = new int[5];
    //phan tu thu nhat trong mang voi chi so i=0
    array1[0] =1;
  //phan tu thu hai trong mang voi chi so i=1
    array1[1] =2;
  //phan tu thu ba trong mang voi chi so i=2
    array1[2] =3;
  //phan tu thu tu trong mang voi chi so i=3
    array1[3] =4;
    //phan tu thu nam trong mang voi chi so i=4
    array1[4] =5;
    //mang nay tong so luong phan tu la bao nhieu
    System.out.println("arraylenght = " +array1.length);
    // in ra phan tu thu 3 co chi so la 2 trong mang
    System.out.println("array1[2] = " +array1[2]);
    // su dung vong lap for de in ra cac phan tu co trong mang
    for (int i =0; i<array1.length; i++)
    {
    	
    	System.out.println("Element co chi so i = " + i + " co gia tri =" + array1[i]);
    	
    }
    
	}

}
