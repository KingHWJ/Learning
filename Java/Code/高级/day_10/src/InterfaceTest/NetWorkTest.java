package InterfaceTest;


public class NetWorkTest {
    public static void main(String[] args) {
        Server s = new Server();
        new Proxy(s).browse();
    }
}


interface NetWork{

    void browse();
}

class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器，访问网络");
    }
}

class Proxy implements NetWork{

    private NetWork work;

    public Proxy(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("检查一下网络情况");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}

