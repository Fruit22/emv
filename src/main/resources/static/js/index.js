
$(document).ready(function () {
    var button = document.getElementById('btn1');
    button.addEventListener('click', function () {
        $.ajax({
            url: "/btn1",
            type: "POST"
        });
    });
});
