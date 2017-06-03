package ru.emv.tester;

import ru.emv.kernel.KernelState;

/**
 * Интерфейс, содержащий функции для обращения к ядру.
 */
public interface KernelTester {

    void sendReaderCommand(ReaderCommand readerCommand, String data);

    KernelState getKernelState();

}
