$(document).ready(function () {
    var actButton = document.getElementById('act-signal');
    var stopButton = document.getElementById('stop-signal');
    var cleanButton = document.getElementById('clean-signal');
    var idleState = document.getElementById('idle-state');

    addTestToButton(actButton, "readerCommands/actCommand");
    addTestToButton(stopButton, "readerCommands/stopCommand");
    addTestToButton(cleanButton, "readerCommands/cleanCommand");
    changeKernelStateToIdle(idleState,"readerCommands/idleState");
    // Добавление тестов
    function addTestToButton(button, testUrl) {
        button.addEventListener('click', function () {
            $.ajax({
                url: testUrl,
                type: "POST"
            }).done(function (result) {
                if (result) {
                    $("#test-result").text("Тест пройден!");
                } else {
                    $("#test-result").text("Тест провален!");
                }
            });
        });
    }
    // Перевести ядро в состоенияе ожидания
    function changeKernelStateToIdle(button, testUrl) {
        button.addEventListener('click', function () {
            $.ajax({
                url: testUrl,
                type: "POST"
            }).done(function (result) {
                    $("#test-result").text("Ядро перешло в состояние ожидания!");
            });
        });
    }

});
