
$(document).ready(function () {
    var button = document.getElementById('btn1');
    button.addEventListener('click', function () {
        $.ajax({
            url: "readerCommands/actCommand",
            type: "POST"
        }).done(function (result) {
            if (result) {
                $("#test-result").text("Тест пройден!");
            } else {
                $("#test-result").text("Тест провален!");
            }
        });
    });
});
