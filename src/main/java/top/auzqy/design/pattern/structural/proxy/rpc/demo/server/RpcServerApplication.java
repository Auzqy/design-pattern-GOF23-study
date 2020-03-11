package top.auzqy.design.pattern.structural.proxy.rpc.demo.server;


import top.auzqy.design.pattern.structural.proxy.rpc.RpcServer;

public class RpcServerApplication {

    public static void main(String[] args) throws Exception {
      CalculatorService service = new CalculatorServiceImpl();
      RpcServer server = new RpcServer();
      server.export(service, 1234);
    }

}
