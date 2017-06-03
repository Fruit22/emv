package ru.emv.tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.emv.kernel.JavaKernel;

@Service
@Qualifier("java")
public class JavaKernelTester implements KernelTester {

    @Autowired
    private JavaKernel kernel;

    @Override
    public String sendReaderCommand(ReaderCommand readerCommand, String data) {
        String reponse = kernel.processReaderCommand(readerCommand, data);

    }
}
