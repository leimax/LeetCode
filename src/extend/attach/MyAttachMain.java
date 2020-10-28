package extend.attach;
import com.sun.tools.attach.VirtualMachine;
public class MyAttachMain {
    public static void main(String[] args) throws Exception {
//        VirtualMachine vm = VirtualMachine.attach(args[0]);
        VirtualMachine vm = VirtualMachine.attach("123");
        try {
            vm.loadAgent("agent.jarÈ«Â·¾¶µØÖ·");
        } finally {
            vm.detach();
        }
    }
}