class DemoFinally{
    public static void main(String [] args){
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println("Exception Handled:"+e);
        }finally{
            System.out.println("Finally Excecuted");
        }
        System.out.println("Rest of the code...");
    }
}
