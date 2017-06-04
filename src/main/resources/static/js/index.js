$(document).ready(function () {
    var actButton = document.getElementById('act-signal');
    var stopButton = document.getElementById('stop-signal');
    var cleanButton = document.getElementById('clean-signal');

    addTestToButton(actButton, "readerCommands/actCommand");
    addTestToButton(stopButton, "readerCommands/stopCommand");
    addTestToButton(cleanButton, "readerCommands/cleanCommand");

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

});
