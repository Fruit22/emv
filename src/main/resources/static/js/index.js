$(document).ready(function () {
    var actButton = document.getElementById('act-test');
    var stopButton = document.getElementById('stop-test');
    var cleanButton = document.getElementById('clean-test');
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
                    $("#test-result").text("Тест \"" + button.id + "\" пройден!");
                    $("#test-result").removeClass("bg-info bg-danger").addClass("bg-success");
                    $("#test-result").removeClass("text-primary text-danger").addClass("text-success");
                } else {
                    $("#test-result").text("Тест \"" + button.id + "\" провален!");
                    $("#test-result").removeClass("bg-info bg-success").addClass("bg-danger");
                    $("#test-result").removeClass("text-primary text-success").addClass("text-danger");
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
