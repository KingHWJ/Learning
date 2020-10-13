package InterfaceTest;

interface AnInterface {
    void firstMethod();
    void secondMethod();


    default void newMethod(){
        System.out.println("接口中，方法的默认实现newMethod");
    };


}