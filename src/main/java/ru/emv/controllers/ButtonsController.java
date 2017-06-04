package ru.emv.controllers;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.emv.kernel.JavaKernel;
import ru.emv.message.MessageBuilder;
import ru.emv.tester.KernelTester;
import ru.emv.tester.ReaderCommand;
import ru.emv.tests.ReaderCommandTest;

/**
 * Created by fruit on 05.04.2017.
 */
@RestController
public class ButtonsController {

    @Autowired
    MessageBuilder builder;

    @Autowired
    EventBus eventBus;

    @Autowired
    private ReaderCommandTest readerCommandTest;

    @PostMapping("/**/readerCommands/actCommand")
    public ResponseEntity<Boolean> sendActCommand() {
        Boolean result = readerCommandTest.testActCommand();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/**/readerCommands/stopCommand")
    public ResponseEntity<Boolean> stopActCommand() {
        Boolean result = readerCommandTest.testStopCommand();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/**/readerCommands/cleanCommand")
    public ResponseEntity<Boolean> cleanActCommand() {
        Boolean result = readerCommandTest.testCleanCommand();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/**/readerCommands/idleState")
    public ResponseEntity<Boolean> idleStateCommand() {
        readerCommandTest.changeKernelStateToIdle();
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
