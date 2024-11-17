 class Project{
 public void sayHello(){
 System.out.println("Hello from parent");
 }
}
class child extends Project
{
    @Override
    public void sayHello(){
        System.out.println("Hello from child");
}
}
class Main{
    public static void main(String[]args)
    {
        Project p = new child();
        p.sayHello();
    }

}

