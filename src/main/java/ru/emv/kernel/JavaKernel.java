package ru.emv.kernel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.emv.tester.ReaderCommand;

import java.util.logging.Logger;

@Component
public class JavaKernel {

    private KernelState state = KernelState.OFF;

    @Autowired
    Logger log;
//    @Subscribe
//    public void action(EventMessage messageEvent) {
//        System.out.println("Получил сообщение:" + messageEvent);
//    }

    public void processReaderCommand(ReaderCommand readerCommand, String data) {

        switch (readerCommand) {
            case ACT:
                state = KernelState.GPO;
                break;
            case STOP:
                state = KernelState.OFF;
                break;
            case CLEAN:
                state = KernelState.OFF;
                break;
            default:
                state = KernelState.OFF;

        }
        log.info("Ядро перешло в состояние: " + this.state);
    }

    public KernelState getState() {
        return state;
    }
}
