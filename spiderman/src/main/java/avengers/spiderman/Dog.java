package avengers.spiderman;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/2/18 11:13
 */
public class Dog {
    private  String myName;

    private  String myColor;

//    public Dog(){
//
//
//    }


    public Dog(String myName, String myColor,int age){

        this.myColor=myColor;

        this.myName=myName;


        System.out.println(age);
    }

    public void  barkj()
    {
        System.out.println("我的颜色"+myColor);
        System.out.println("我的名字"+myName);
    }
}


