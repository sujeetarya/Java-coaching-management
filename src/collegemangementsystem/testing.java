package collegemangementsystem;

interface X
{
    void t();
}

interface Y
{
    int c(int u);
}


public class testing {
    
    public static void main(String[] args) {
        
        X ob=()->System.out.println("hello my friend");
        
        ob.t();
        
        
        Y b=(s)->s*s;
        
        System.out.println(b.c(67));   
    }
}
