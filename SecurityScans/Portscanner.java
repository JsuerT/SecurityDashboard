import java.util.*; 
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.net.*;
import java.io.*; 

public class Portscanner{

//TODO ports mehr infos: kennzeichnen - was ist wo verbundne; 
// die ports nur anzeigen wenn man unter mehr infos anklickt wenn ich mal ne GUI mache

  public static void main(String[]args)throws IOException{



    String ip = "192.168.122.1";
    //ggf noch IP selber suchen lassen
    int nbrPortMaxToScan = 65535;
    int poolSize = 200; //maybe ändern
    int timeOut = 200; //maybe auch ädnenr
    ConcurrentLinkedQueue<Integer> openPorts = new ConcurrentLinkedQueue<>();
    ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
    AtomicInteger port = new AtomicInteger(0);
    while (port.get() < nbrPortMaxToScan) {
      final int currentPort = port.getAndIncrement();
      executorService.submit(() -> {
        try {
          Socket socket = new Socket();
          socket.connect(new InetSocketAddress(ip, currentPort), timeOut);
          socket.close();
          openPorts.add(currentPort);
          System.out.println(ip + " ,port open: " + currentPort);
        } catch (IOException e) {
          System.err.println(e);
        }
      });
    }
    executorService.shutdown();
    try {
      executorService.awaitTermination(10, TimeUnit.MINUTES);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    List<Integer> openPortList = new ArrayList<>();
    System.out.println("openPortsQueue: " + openPorts.size());
    while (!openPorts.isEmpty()) {
      openPortList.add(openPorts.poll());
    }
    openPortList.forEach(p -> System.out.println("port " + p + " is open"));
  }

}
