
let ball = new Ball(50, 0, 50);

let canvas = document.getElementById("myGame");
let context = canvas.getContext("2d");

function drawCanvas() {
    context.beginPath();
    context.clearRect(0 , 0, canvas.width, canvas.height);
    context.arc(ball.x, ball.y, ball.radius,0, 2 * Math.PI);
    context.fillStyle = "#FF000F";
    context.fill();
}

let d = 1;
function moveBall() {
    if (ball.x > 500 || ball.x < 0) {
        d = -d;
    }
    ball.move(d);
    drawCanvas();
}

setInterval(moveBall, 10);