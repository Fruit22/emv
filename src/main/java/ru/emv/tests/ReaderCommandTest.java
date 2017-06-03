package ru.emv.tests;

import org.springframework.stereotype.Component;
import ru.emv.tester.KernelTester;
import ru.emv.tester.ReaderCommand;

@Component
public class ReaderCommandTest {

    private KernelTester tester;

    public ReaderCommandTest(KernelTester tester) {
        this.tester = tester;
    }

    public boolean testActCommand() {
        tester.sendReaderCommand(ReaderCommand.ACT, "asdwerfw45r346e46hn45j7ed5k");
        return kernel.state == KernelState.GPO;
    }

}
