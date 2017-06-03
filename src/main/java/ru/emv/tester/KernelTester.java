package ru.emv.tester;

/**
 * Интерфейс, содержащий функции для обращения к ядру.
 */
public interface KernelTester {

    String sendReaderCommand(ReaderCommand readerCommand, String data);

}
