class Test   
{  
    int test_a, test_b;  
	Test()   
    {  
    test_a = 0;   
    test_b = 0;   
    }  
    Test(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    public static void main (String args[])   
    {  
        Test test = new Test();   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
}  