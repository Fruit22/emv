package ru.emv.tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.emv.kernel.JavaKernel;
import ru.emv.kernel.KernelState;

@Service
@Qualifier("java")
public class JavaKernelTester implements KernelTester {

    @Autowired
    private JavaKernel kernel;

    @Override
    public void sendReaderCommand(ReaderCommand readerCommand, String data) {
        kernel.processReaderCommand(readerCommand, data);
    }

    @Override
    public KernelState getKernelState() {
        return kernel.getState();
    }
}
