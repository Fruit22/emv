package ru.emv.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.emv.kernel.KernelState;
import ru.emv.tester.KernelTester;
import ru.emv.tester.ReaderCommand;

@Component
public class ReaderCommandTest {

    private KernelTester tester;

    @Autowired
    public ReaderCommandTest(KernelTester tester) {
        this.tester = tester;
    }

    public boolean testActCommand() {
        tester.sendReaderCommand(ReaderCommand.ACT, "asdwerfw45r346e46hn45j7ed5k");
        return tester.getKernelState() == KernelState.GPO;
    }

    public boolean testCleanCommand() {
        tester.sendReaderCommand(ReaderCommand.CLEAN, "asdwerfw45r346e46hn7ed5k");
        return tester.getKernelState() == KernelState.OFF;
    }

    public boolean testStopCommand() {
        tester.sendReaderCommand(ReaderCommand.STOP, "asdwerfw45r346e46hnd5k");
        return tester.getKernelState() == KernelState.OFF;
    }

}
