package ru.emv.kernel;

import org.springframework.stereotype.Component;
import ru.emv.tester.ReaderCommand;

@Component
public class JavaKernel {

    private KernelState state = KernelState.OFF;

    public void processReaderCommand(ReaderCommand readerCommand, String data) {

        switch (readerCommand) {
            case ACT:
                state = KernelState.GPO;
                break;
            default:
                state = KernelState.OFF;

        }
    }

    public KernelState getState() {
        return state;
    }
}
