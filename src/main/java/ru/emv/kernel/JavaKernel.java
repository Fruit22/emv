package ru.emv.kernel;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;
import ru.emv.message.EventMessage;
import ru.emv.tester.ReaderCommand;

@Component
public class JavaKernel {

//    @Subscribe
//    public void action(EventMessage messageEvent) {
//        System.out.println("Получил сообщение:" + messageEvent);
//    }

    public String processReaderCommand(ReaderCommand readerCommand, String data) {
        return null;
    }
}
